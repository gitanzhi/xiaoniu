package cn.edu360.javase.collection;

/**
 * 增强for循环
 */
import java.util.ArrayList;
import java.util.List;

public class ForeachDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("javase");
		list.add("javame");
		list.add("javaee");
		
		if(list !=null) {
			for (String string : list) {
				System.out.println(string);
			}
		}
		
		
		int[] arr = new int[] {12,3,4,5};
		if(arr != null) {
			for (int i : arr) {
				System.out.println(i);
			}
		}
		
		
	}

}
