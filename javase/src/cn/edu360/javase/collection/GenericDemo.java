package cn.edu360.javase.collection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 如果泛型不明确指定，默认是object类型
 * 泛型只存在于编译时期，确保强制转换不出错误
 * @author Liu Ming
 * @createdTime 2018年4月16日 下午2:09:39
 */
public class GenericDemo {

	public static void main(String[] args) {
		
		//泛型是1.5有的，1.7以后，右边的泛型可以不写，默认是左边的
		ArrayList<Double> list1 = new ArrayList<>();
		
		list1.add(1000.0);
		list1.add(2000.23);
		
		Iterator<Double> iterator = list1.iterator();
		while(iterator.hasNext()) {
			double d = iterator.next();
			System.out.println(d);
		}
		
	}

}


