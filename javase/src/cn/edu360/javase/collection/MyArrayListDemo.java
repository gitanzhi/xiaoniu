package cn.edu360.javase.collection;

import java.util.ArrayList;
/**
 * 泛型定义在类上，模拟
 * @author Liu Ming
 * @createdTime 2018年4月16日 下午2:11:48
 */
public class MyArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("123");
		
		MyArrayList<String> list2 = new MyArrayList<>();
		list2.add("3333");
		list2.add("33221");
		System.out.println(list2.get(0));
		System.out.println(list2);
	}

}

class MyArrayList<T>{
	private Object[] object = new Object[10];
	
	public boolean add(T t) {
		for(int i=0;i<object.length;i++) {
			if(object[i]==null) {
				object[i] = t;
				return true;
			}
		}
		return false;
	}
	
	
	public T get(int index) {
		 return (T) object[index];
	}
	
	@Override
	public String toString() {
		StringBuilder sb1 = new StringBuilder();
		sb1.append("[");
		for (int i = 0; i < object.length; i++) {
			if(object[i]!=null) {
				sb1.append(object[i]+",");
			}
		}
		//逗号去掉
		String str1 = sb1.toString().substring(0,sb1.length()-1);
		return str1+"]";
	}
	
}
