package cn.edu360.day07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.methods.GetMethod;

import com.alibaba.fastjson.JSON;

public class GeoHash {
	
	static Map<String, String> map = null;
	
	static{
		map = loadData();
	}
	
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new FileReader("D:\\java\\data\\day07bikes.log"));) {
			//{"page":"/pages/index/index","event_type":1,"time":"2018-03-14 12:35:22","uid":"oF-8j0aNka8IQYCZsxyrO6X7jzqY","longitude":112.12255,"latitude":32.009,"province":"湖北省","city":"襄阳市","district":"襄城区"}
			String line = null;
			while((line=br.readLine())!=null){
				BikeBean bikeBean = JSON.parseObject(line, BikeBean.class);
				double latitude = Double.parseDouble(bikeBean.getLatitude());
				double longitude = Double.parseDouble(bikeBean.getLongitude());
				String addr = findAddr(latitude,longitude);//查找位置
				System.out.println(addr);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static String findAddr(double latitude, double longitude) {
		String addr = findAddrByLocal(latitude,longitude);
		
		if(addr==null){
			//在本地未找到,需要网络查找
			addr = findAddrByNet(latitude,longitude);
		}
		return addr;
	}

	private static String findAddrByNet(double latitude, double longitude) {
		String json = getJsonByNet(latitude,longitude);
		ResultBean resultBean = JSON.parseObject(json, ResultBean.class);
		String hash = GeoHashUtils.getGeoHash(latitude, longitude);
		AddrList addList = resultBean.getAddrList()[0];
		String provinceCity = addList.getAdmName();
		String[] split = provinceCity.split(",");
		if(split.length>2){
			String province = split[0];
			String city = split[1];
			String district = split[2];
			String ret = hash+"\t"+province+"\t"+city+"\t"+district+"\t"+addList.getName();
			try(BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\java\\data\\day07repository.tsv", true));) {
				bw.write(ret);
				bw.newLine();
				bw.flush();
				System.err.println(ret);
				map.put(hash, ret);//更新内存
			} catch (IOException e) {
				e.printStackTrace();
			}
			return ret;
		}
		return null;
	}

	private static String getJsonByNet(double latitude, double longitude) {
		HttpClient client = new HttpClient();
		String url = "http://gc.ditu.aliyun.com/regeocoding?l=" + latitude + "," + longitude+"&type=010";
		try {
			HttpMethod method = new GetMethod(url);
			client.executeMethod(method);
			return method.getResponseBodyAsString();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	private static String findAddrByLocal(double latitude, double longitude) {
		String hash = GeoHashUtils.getGeoHash(latitude, longitude);
		String ret = map.get(hash);
		return ret;
	}

	public static Map<String, String> loadData(){
		HashMap<String, String> map = new HashMap<>();
		try(BufferedReader br = new BufferedReader(new FileReader("D:\\java\\data\\day07repository.tsv"));) {
			String line = null;
			while((line=br.readLine())!=null){
				String[] split = line.split("\t");
				String goHashCode = split[0];
				map.put(goHashCode, line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	}
}
