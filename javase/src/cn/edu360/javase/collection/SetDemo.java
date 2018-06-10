package cn.edu360.javase.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * set：不能包含重复的元素，不能通过索引值操作元素
 * HashSet :存入的顺序和取出不保证一致 
 * LinkedHashSet 是HashSet的子类,存入的顺序和取出的一致
 * set 去重原理  set集合内部都是通过哈希表的结构去重，依赖存储对象元素的hashcode和equals
 * 去重步骤：1.首先判断存入对象的哈希值和已有元素比较，
 *          如果不同，说明不是重复元素，直接添加，
 *          如果哈希值相同，就调用对象的equals方法进行判断，
 *             如果equals返回true，说明是相同对象，不添加
 *             否则就添加
 *  equals 相等，hashcode肯定相等
 *  equals不相等的对象，hashcode可能相等
 * 
 * 
 * @author Liu Ming
 * @createdTime 2018年4月29日 下午3:22:08
 */
public class SetDemo {

	public static void main(String[] args) {
		//test();
		Set<Person> set = new HashSet<Person>();
		set.add(new Person("张三",18,'女'));
		set.add(new Person("张三",18,'女'));
		set.add(new Person("张三",18,'女'));
		System.out.println(set);
		
		
		Person person =   new Person("张三",18,'女');
		Person person1 =   new Person("张三",18,'女');
		System.out.println(person.equals(person1));
	}

	public static void test() {
		Set<String> set = new LinkedHashSet<String>();
		set.add("javase");
		set.add("javame");
		set.add("javase");
		set.add("javase");
		set.add("javaee");
		set.add("javase");
		set.add("android");
		System.out.println(set);
	}

}
