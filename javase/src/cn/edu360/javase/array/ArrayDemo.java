package cn.edu360.javase.array;

public class ArrayDemo {
	public static void main(String[] args) {
		//数组的声明
		int[] arr;
		int arr1[];
		
		//数组的初始化
		int[] arr2  = new int[3];
		arr2[0] = 2;
		System.out.println(arr2[0]);
		
		
		String[] strings = new String[3];
		strings[2] = "33";
		strings[1] = "a";
		System.out.println(strings);
		
		//静态初始化
		int[] arr3 = new int[] {1,2,3,4};
		int[] arr4 = {4,5,6,7,8,9};
		
		//获取长度
		System.out.println(arr4.length);
	}
}
