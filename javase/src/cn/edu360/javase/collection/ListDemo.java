package cn.edu360.javase.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * list集合
 * @author liuming
 * @date 2018年4月15日  下午11:38:49
 */
public class ListDemo {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("java");
		list.add("javase");
		list.add("javame");
		System.out.println(list);//[java, javase, javame]
		
		list.add(2,"android");//没有返回值，占用其他位置依次后移
		System.out.println(list);//[java, javase, android, javame]
		
		System.out.println(list.remove(0));//java 返回删除的元素
		System.out.println(list);
		
		System.out.println(list.get(2));//javame
		
		System.out.println(list.set(2, "hadoop"));//返回之前的值
		
		//遍历的时候不可以直接修改元素
		ListIterator it = list.listIterator();
		while(it.hasNext()) {
			it.add("123");//可以使用it的增加方法
			Object object = it.next();
			System.out.println(object);
		}
		
	}

}
