package cn.edu360.javase.collection;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * set 不能有重复的元素
 * 		HashSet
 * 			LinkedHashSet
 * 		TreeSet对元素进行默认的升序排列，存储的一定实现comparable接口
 * @author Liu Ming
 * @createdTime 2018年4月29日 下午8:33:22
 */
public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(329);
		set.add(22);
		set.add(82);
		System.out.println(set);
		
		
		TreeSet<Integer> set1 = new TreeSet<Integer>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				//return o2-o1;
				return o2.compareTo(o1);
			}
			
		});
		set1.add(39);
		set1.add(22);
		set1.add(82);
		System.out.println(set1);//降序
		
		
		TreeSet<Person> set2 = new TreeSet<Person>(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getName().equals(o2.getName())?o1.getAge()-o2.getAge():o1.getName().compareTo(o2.getName());
			}
		});
		set2.add(new Person("zhangsan",12,'女'));
		set2.add(new Person("lisi",32,'男'));
		set2.add(new Person("wangwu",33,'女'));
		System.out.println(set2);
		
	}

}
