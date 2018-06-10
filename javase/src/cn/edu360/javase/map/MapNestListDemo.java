package cn.edu360.javase.map;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * map集合中嵌套list
 * 三国演义
 *   吕布
 *   周瑜
 * 笑傲江湖
 *   令狐冲
 *   林平之
 * 神雕侠侣
 *   杨过
 *   郭靖
 * @author Liu Ming
 * @createdTime 2018年4月29日 下午4:27:45
 */
public class MapNestListDemo {

	public static void main(String[] args) {
		Map<String, List<String>> map = new LinkedHashMap<String, List<String>>();
		List<String> list = new ArrayList<String>();
		list.add("吕布");
		list.add("周瑜");
		map.put("三国演义",list);
		
		list = new ArrayList<String>();
		list.add("令狐冲");
		list.add("林平之");
		map.put("笑傲江湖", list);
		
		list = new ArrayList<String>();
		list.add("杨过");
		list.add("郭靖");
		map.put("神雕侠侣", list);
		
		//第一种遍历
		Set<String> set = map.keySet();
		for (String string : set) {
			System.out.println(string);
			List<String> list2 = map.get(string);
			for (String string2 : list2) {
				System.out.println("\t"+string2);
			}
		}
		//第二种遍历
		Set<Entry<String, List<String>>> entrySet = map.entrySet();
		for (Entry<String, List<String>> entry : entrySet) {
			String key = entry.getKey();
			System.out.println(key);
			List<String> list2 = entry.getValue();
			for (String string : list2) {
				System.out.println("\t"+string);
			}
		}
		
	}

}
