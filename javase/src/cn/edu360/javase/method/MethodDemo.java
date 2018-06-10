package cn.edu360.javase.method;

import java.util.Scanner;

/**
 * 方法
 * @author Liu Ming
 * @createdTime 2018年4月11日 下午3:01:19
 */
public class MethodDemo {
	
	public static void main(String[] args) {
		int c = getSum(3,4);
		System.out.println(c);
		sayHello();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数");
		int sc1 = sc.nextInt();
		System.out.println("请输入第二个");
		int sc2 = sc.nextInt();
		System.out.println("请输入第三个数");
		int sc3 = sc.nextInt();
		System.out.println(getMax(sc1,sc2));
		System.out.println(equals(sc2,sc3));
		printXing(sc2,sc3);
	}
	
	/*
	 * 有返回值的方法
	 */
	public static int getSum(int a,int b) {
		return a+b;
	}
	
	/*
	 * 没有返回值
	 */
	public static void sayHello() {
		System.out.println("Hello");
	}
	
	/*
	 * 计算返回两个最大的值
	 */
	public static int getMax(int a,int b) {
		return a>b?a:b;
	}
	
	public static String equals(int a,int b) {
		return a==b?"相等":"不相等";
	}
	
	/*
	 * 打印乘法表
	 */
	public static void printXing(int a,int b) {
		for (int i = 1; i < a; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}
			System.out.println();
		}
	}
	

}
