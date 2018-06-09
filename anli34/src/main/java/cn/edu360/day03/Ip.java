package cn.edu360.day03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Ip {
	
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		try (BufferedReader br = new BufferedReader(new FileReader("D:\\java\\data\\day03access.log"));){
			String line = null;
			while((line=br.readLine())!=null){
				String[] split = line.split("\\|");
				String strip = split[1];
				Long ip = IpUtils.strIpToLongIp(strip);
				IpBean bean = IpUtils.getBeanByIpNew(ip);
				
				String province = bean.getProvince();
				
				Integer count = map.getOrDefault(province, 0);
				count++;
				map.put(province, count);
				/*boolean isHasKey = map.containsKey(province);
				if(isHasKey){
					Integer count = map.get(province);
					count++;
					map.put(province, count);
				}else{
					map.put(province, 1);
				}*/
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		ArrayList<Entry<String, Integer>> list = new ArrayList<>(entrySet);
		Collections.sort(list, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getValue()-o2.getValue();
			}
		});
		for (Entry<String, Integer> entry : list) {
			System.out.println(entry);
		}
		
	}
}
