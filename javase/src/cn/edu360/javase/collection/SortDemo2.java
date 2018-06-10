package cn.edu360.javase.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortDemo2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(-10);
		list.add(10);
		list.add(900);
		list.add(20);
		System.out.println(list);
		
		Collections.sort(list);//升序
		System.out.println(list);
		
		//自定义类1）
		Collections.sort(list, new IntegerCompator());
		System.out.println(list);
		
		//匿名内部类2）
		Collections.sort(list, new Comparator<Integer >() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;//降序
			}
		}); 
		System.out.println(list);
		
		ArrayList<Person> list2 = new ArrayList<Person>();
		list2.add(new Person("zhangsan",18,'女'));
		list2.add(new Person("lisi",15,'女'));
		list2.add(new Person("wangwu",20,'女'));
		list2.add(new Person("zhaoliu",28,'女'));
		System.out.println(list2);
		Collections.sort(list2, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getName().equals(o2.getName())?o1.getAge()-o2.getAge():o1.getName().compareTo(o2.getName());
			}
		});
		
	}

}

class IntegerCompator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2-o1;//降序
	}

	
	
}
