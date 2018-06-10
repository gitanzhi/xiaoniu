package cn.edu360.javase.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 遍历
 * @author liuming
 * @date 2018年4月15日  下午11:30:52
 */
public class CollectionDemo3 {

	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add("javase");
		c1.add("javame");
		c1.add("javaee");
		c1.add("jsp");
		showCollection1(c1);
	}
	
	private static void showCollection1(Collection c) {
		Iterator it1 = c.iterator();
		while(it1.hasNext()) {//如果仍有元素可以迭代，继续
			Object object = it1.next();
			System.out.println(object);
		}
	}
	
	private static void showCollection(Collection c) {
		Object[] array = c.toArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
