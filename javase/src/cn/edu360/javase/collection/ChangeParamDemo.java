package cn.edu360.javase.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 可变参数
 * @author Liu Ming
 * @createdTime 2018年4月29日 下午2:56:49
 */
public class ChangeParamDemo {

	public static void main(String[] args) {
		System.out.println(getSum(1,2,3,5));
		
		
		
		//数组和集合相互
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(323);
		list.add(333);
		
		//集合=》数组
		Integer[] arr1 = (Integer[]) list.toArray();
		System.out.println(list.toArray());
		
		//数组=》集合
		List<Integer> list2 = Arrays.asList(arr1);
	}

	//多个参数可变参数，放在后边
	public static int getSum(int... arr) {
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
		}
		return sum;
	}
}
