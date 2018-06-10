package cn.edu360.javase.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 服务员 
 * 		f001 小张
 * 		f002 小李
 * 厨师
 * 		c001 老赵
 * 		c002 老王
 * 
 * @author Liu Ming
 * @createdTime 2018年4月29日 下午6:58:01
 */
public class MapNestMapDemo {

	public static void main(String[] args) {
		Map<String,String> waitor = new LinkedHashMap<String, String>();
		waitor.put("f001", "小张");
		waitor.put("f002", "小李");
		
		Map<String,String> cook = new LinkedHashMap<String, String>();
		cook.put("c001", "老赵");
		cook.put("c002", "老王");
		
		Map<String, Map<String, String>> jd = new HashMap<String, Map<String, String>>();
		jd.put("服务员", waitor);
		jd.put("厨师",cook);
		
		for (Entry<String, Map<String, String>> entry :jd.entrySet()) {
			System.out.println(entry.getKey());
			Map<String, String> map= entry.getValue();
			for (Entry<String,String> entry2:map.entrySet()) {
				System.out.println("\t"+entry2.getKey()+":"+entry2.getValue());
			}
		}
	}

}
