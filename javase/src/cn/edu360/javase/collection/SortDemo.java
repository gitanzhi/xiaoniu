package cn.edu360.javase.collection;

import java.util.ArrayList;
import java.util.Collections;

public class SortDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(-10);
		list.add(10);
		list.add(900);
		list.add(20);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);//默认升序
		
		//自定义，方便重写的时候
		ArrayList<Person> list2 = new ArrayList<Person>();
		list2.add(new Person("zhangsan",18,'女'));
		list2.add(new Person("lisi",15,'女'));
		list2.add(new Person("wangwu",20,'女'));
		list2.add(new Person("zhaoliu",28,'女'));
		System.out.println(list2);
		//Collections.sort(list2);
		System.out.println(list2);
		
	}

}
