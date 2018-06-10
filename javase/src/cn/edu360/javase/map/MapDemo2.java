package cn.edu360.javase.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo2 {


	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(110,"报警");
		map.put(120, "急救");
		map.put(119, "火警");
		System.out.println(map);
		
		//test(map);
		//第一种
		Set<Integer> keySet = map.keySet();
		for(Integer key :keySet) {
			String value = map.get(key);
			System.out.println("key:"+key+"value:"+value);
		}
		
		//第二种
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println("key:"+key+"value:"+value);
		}
	}
	
	private static void test(Map<Integer, String> map) {
		Set<Integer> keySet = map.keySet();
		for(Integer integer :keySet) {
			System.out.println(integer);
		}
		
		
		Collection<String> values = map.values();
		for (String string : values) {
			System.out.println(string);
		}
		
	}

}
