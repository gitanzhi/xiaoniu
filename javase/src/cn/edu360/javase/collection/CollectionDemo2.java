package cn.edu360.javase.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author liuming
 * @date 2018年4月15日  下午7:49:45
 */
public class CollectionDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add("javase");
		c1.add("javame");
		c1.add("javaee");
		c1.add("jsp");
		
		Collection c2 = new ArrayList();
		c2.add("jsp");
		c2.add("hadoop");
		c2.add("spark");
		
		c1.addAll(c2);//将集合添加到此集合中
		System.out.println(c1);
		System.out.println(c2);
		
		c1.removeAll(c2);//移除包含在集合中的元素, 重复的也删除
		System.out.println(c1);
		
		c1.addAll(c2);
		System.out.println(c1.contains(c2));//包含c2的所有元素返回true
		
		System.out.println(c1.retainAll(c2));//取交集
		System.out.println(c1);
		
	}

}
