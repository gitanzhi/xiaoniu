package cn.edu360.javase.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author liuming
 * @date 2018年4月15日  下午7:38:55
 */
public class CollectionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
 		Collection c1 = new ArrayList();
 		c1.add("javase");
 		c1.add(123);
 		c1.add("javaee");//boolean
 		System.out.println(c1);//[javase, 123, javaee]
 		
 		c1.remove(123);//boolean
 		System.out.println(c1);//[javase, javaee]
 		
 		c1.clear();//清除
 		
 		System.out.println(c1.contains("javase"));//true
 		
 		System.out.println(c1.isEmpty());//false
 		
 		System.out.println(c1.size());//2
 		
	}

}
