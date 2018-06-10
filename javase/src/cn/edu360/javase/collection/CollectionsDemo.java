package cn.edu360.javase.collection;

import java.util.ArrayList;
import java.util.Collections;

/**
 * collections 类
 * @author Liu Ming
 * @createdTime 2018年4月29日 下午7:39:15
 */
public class CollectionsDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(-10);
		list.add(10);
		list.add(222);
		
		list.add(900);
		list.add(20);
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);//默认升序

		System.out.println(Collections.binarySearch(list, 102));
		
		System.out.println(Collections.max(list));
		
		Collections.reverse(list);
		System.out.println(list);
		
		Collections.shuffle(list);
		System.out.println(list);
		
		new A() {
			public void a() {
				System.out.println("AA");
			}
		}.a();
	}

}

interface A{
	void a();
}
