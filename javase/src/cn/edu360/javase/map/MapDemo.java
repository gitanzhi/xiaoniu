package cn.edu360.javase.map;

import java.util.HashMap;
import java.util.Map;

/**
 *  Map  键值对
 *  键不能重复
 *  子类：
 *    HashMap:存入和取出的顺序不保证一致
 *    LinkedHashMap:存入和取出的顺序一致  
 *    
 *    
 *    
 * @author Liu Ming
 * @createdTime 2018年4月29日 下午3:49:04
 */
public class MapDemo {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(110,"报警");
		map.put(110,"报警1");
		map.put(120, "急救");
		map.put(119, "火警");//覆盖前面的
		System.out.println(map);
		
		System.out.println(map.remove(119));//火警
		System.out.println(map);
		System.out.println(map.remove(1111));//null
		
		//map.clear();
		System.out.println(map);//{}
		
		System.out.println(map.containsKey(119));//false
		System.out.println(map.containsValue("火警"));//false
	
		System.out.println(map.isEmpty());//false
		System.out.println(map.size());//2
		
		
		
	}

}
