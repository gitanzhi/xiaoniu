package cn.edu360.javase.map;

import java.util.Comparator;
import java.util.TreeMap;

import cn.edu360.javase.collection.Person;

/**
 * Map 键值对存在  键不能重复
 * 		HashMap  顺序和取出不保证一致
 * 			LinkedHashMap  顺序和取出一致
 * 		TreeMap 可以对键默认的升序，存储的元素要实现comparable 接口
 * 
 * @author Liu Ming
 * @createdTime 2018年4月29日 下午9:12:11
 */
public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<Integer,String> treeMap = new TreeMap<Integer,String>();
		treeMap.put(-109, "哈哈");
		treeMap.put(12, "黑哈");
		treeMap.put(39, "呼哈");
		System.out.println(treeMap);
		
		TreeMap<Integer,String> treeMap1 = new TreeMap<Integer,String>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
		});
		treeMap1.put(-109, "哈哈");
		treeMap1.put(12, "黑哈");
		treeMap1.put(39, "呼哈");
		System.out.println(treeMap1);
		
		
		TreeMap<Person, String> treeMap2 = new TreeMap<Person,String>(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getName().equals(o2.getName())?o1.getAge()-o2.getAge():o1.getName().compareTo(o2.getName());
			}
		});
		treeMap2.put(new Person("zhangsan",12,'女'),"哈哈");
		treeMap2.put(new Person("lisi",32,'男'),"哈哈");
		treeMap2.put(new Person("wangwu",33,'女'),"哈哈");
		System.out.println(treeMap2);
	
	
	
	}

}
