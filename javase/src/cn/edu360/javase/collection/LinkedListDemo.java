package cn.edu360.javase.collection;

import java.util.LinkedList;

/**
 *	linkedlist特有的
 * @author liuming
 * @date 2018年4月16日  上午12:12:34
 */
public class LinkedListDemo {
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("哈哈");
		list.add("呵呵");
		System.out.println(list);
		
		list.addFirst("嘿嘿");//将制定元素添加到开头
		System.out.println(list);
		
		list.addLast("嘻嘻");//插入结尾
		System.out.println(list);
		
		System.out.println(list.getFirst());//返回列表第一个
		System.out.println(list.getLast());//返回列表最后一个
		
		System.out.println(list.removeFirst());//删除列表第一个并返回
		System.out.println(list);
		
		System.out.println(list.removeLast());//删除列表最后一个并返回
		System.out.println(list);
	}
}
