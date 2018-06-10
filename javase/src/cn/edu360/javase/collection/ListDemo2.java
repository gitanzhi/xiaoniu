package cn.edu360.javase.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList
 * @author liuming
 * @date 2018年4月15日  下午11:53:51
 */
public class ListDemo2 {
	public static void main(String[] args) {
		List list = new ArrayList();
		
		Person[] person = new Person[4];
		person[0] = new Person("张三",12,'男');
		
		list.add(new Person("李四",13,'男'));
		list.add(new Person("王五",133,'女'));
		list.add(new Person("赵六",133,'男'));
		list.add(new Person("张三",19,'男'));
		
		System.out.println(list);
		
		
	}
}
