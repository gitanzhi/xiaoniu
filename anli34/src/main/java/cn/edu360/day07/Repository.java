package cn.edu360.day07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Repository {
	public static void main(String[] args) {
		
		try(
				BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\java\\data\\day07-bj-poi-1.csv"), "GBK"));
				BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\java\\data\\day07repository.tsv"));) {
			String line = null;
			while((line=br.readLine())!=null){
				
				try {
					String[] split = line.split(",");
					String addr = split[0];//name
					Double longitude = Double.parseDouble(split[2]);//经度
					Double latitude = Double.parseDouble(split[3]);//纬度
					String city = split[5];//省
					String district = split[7];//区
					String geoHash = GeoHashUtils.getGeoHash(latitude, longitude);
					String ret = geoHash+"\t"+"北京市"+"\t"+city+"\t"+district+"\t"+addr;
					System.out.println(ret);
					bw.write(ret);
					bw.newLine();
					bw.flush();
				} catch (Exception e) {
					e.printStackTrace();
					continue;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
