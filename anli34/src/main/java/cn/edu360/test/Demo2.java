package cn.edu360.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;


public class Demo2 {
	public static void main(String[] args) {
		HashMap<String, String> map = getProvinceMap();
		HashMap<String, List<OrderBean>> hashMap = new HashMap<>();
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
				List<OrderBean> list = hashMap.getOrDefault(province, new ArrayList<>());
				list.add(new OrderBean(uid, ip, category, product, money));
				hashMap.put(province, list);
				SortUtils.getTop3(hashMap);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		Set<Entry<String, List<OrderBean>>> entrySet = hashMap.entrySet();
		for (Entry<String, List<OrderBean>> entry : entrySet) {
			List<OrderBean> list = entry.getValue();
			for (int i = 0; i < Math.min(3, list.size()); i++) {
				System.out.println(entry.getKey()+list.get(i));
			}
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
