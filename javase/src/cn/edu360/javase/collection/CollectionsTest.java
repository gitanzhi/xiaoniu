package cn.edu360.javase.collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

/**
 * 1.获取10个1-20的随机数 随机数不能重复
 * @author Liu Ming
 * @createdTime 2018年4月29日 下午9:28:12
 */
public class CollectionsTest {

	public static void main(String[] args) {
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		Random random = new Random();
		random.nextInt(20);//
		while(set.size()!=10) {
			set.add(random.nextInt(20)+1);
		}
		System.out.println(set);
		
		
		//
		ArrayList<String> list = new ArrayList<String>();
		list.add("javase");
		list.add("javase");
		list.add("javase");
		list.add("javame");
		
		ArrayList<String> list1 = new ArrayList<String>();
		for (String string : list) {
			if(!list1.contains(string)) {
				list1.add(string);
			}
		}
		System.out.println(list1);
	}

}
