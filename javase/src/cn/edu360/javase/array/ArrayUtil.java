package cn.edu360.javase.array;

public class ArrayUtil {
	/*
	 * 打印数组
	 */
	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if(arr.length==1) {
				System.out.println("["+arr[i]+"]"); 
			}else if(i==0) {
				System.out.print("["+arr[i]+",");
			}else if(i==arr.length-1) {
				System.out.println(arr[i]+"]");
			}else {
				System.out.print(arr[i]+",");
			}
		}
	}
	/*
	 * 打印最大和最小值
	 */
	public static void printMaxAndMin(int[] arr) {
		int max = arr[0];
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("最大值为"+max);
		System.out.println("最小值为"+min);
	}
	/*
	 * 数组逆序第一种
	 */
	public static int[] reserve(int[] arr) {
		for (int i = 0; i < (arr.length)/2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
		return arr;
	}
	
	public static int[] reserve1(int[] arr) {
		for (int start = 0,end=arr.length-1;start<end; start++,end--) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
		}
		return arr;
	}
}
