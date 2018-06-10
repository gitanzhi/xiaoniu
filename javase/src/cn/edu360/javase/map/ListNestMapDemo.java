package cn.edu360.javase.map;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;


/**
 * 周瑜--小乔
 * 吕布--貂蝉
 * 
 * 
 * 郭靖--黄蓉
 * 杨过--小龙女
 * 
 * 
 * 令狐冲--任盈盈
 * 林平之--岳灵珊
 * 
 * 
 * @author Liu Ming
 * @createdTime 2018年4月29日 下午7:20:19
 */
public class ListNestMapDemo {

	public static void main(String[] args) {
		LinkedList<LinkedHashMap<String, String>> list = new LinkedList<LinkedHashMap<String, String>>();
		LinkedHashMap<String, String> map = new LinkedHashMap<String,String>();
		map.put("周瑜", "小乔");
		map.put("吕布", "貂蝉");
		list.add(map);
		
		
		map = new LinkedHashMap<String,String>();
		map.put("郭靖", "黄蓉");
		map.put("杨过", "小龙女");
		list.add(map);
		
		map = new LinkedHashMap<String,String>();
		map.put("令狐冲", "任盈盈");
		map.put("林平之", "岳灵珊");
		list.add(map);
		
		
		for (LinkedHashMap<String, String> l : list) {
			for (Map.Entry<String,String> entry:l.entrySet()) {
				System.out.println(entry.getKey()+"---"+entry.getValue());
			}
			System.out.println();
		}
	}

}
