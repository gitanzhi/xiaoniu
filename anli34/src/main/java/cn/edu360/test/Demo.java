package cn.edu360.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo {
	public static void main(String[] args) {
		HashMap<String, String> map = getProvinceMap();
		//计算省的成交量总额
		HashMap<String, Integer> provinceMap = new HashMap<>();
		try(BufferedReader br = new BufferedReader(new FileReader("D:\\java\\data\\anlitest\\orderlog.log"));) {
			String line = null;
			while((line=br.readLine())!=null){
				String[] split = line.split(" ");
				String uid = split[0];
				String ip = split[1];
				String category = split[2];
				String product = split[3];
				Integer money = Integer.parseInt(split[4]);
				String province = map.get(ip);
				
				Integer sum = provinceMap.getOrDefault(province, 0);
				sum+=money;
				provinceMap.put(province, sum);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		Set<Entry<String, Integer>> entrySet = provinceMap.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry);
		}
	}

	/**
	 * @return
	 */
	private static HashMap<String, String> getProvinceMap() {
		HashMap<String, String> map = new HashMap<>();
		try(BufferedReader br = new BufferedReader(new FileReader("D:\\java\\data\\anlitest\\province.txt"));) {
			String line = null;
			while((line=br.readLine())!=null){
				//System.out.println(line);
				String[] split = line.split(" ");
				String province = split[0];
				map.put(split[1], province);
				map.put(split[2], province);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	}
}
