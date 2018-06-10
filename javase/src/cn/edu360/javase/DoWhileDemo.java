package cn.edu360.javase;

import java.util.Scanner;

/**
 * doWhile 循环
 * @author Liu Ming
 * @createdTime 2018年4月10日 下午5:54:28
 */
public class DoWhileDemo {

	public static void main(String[] args) {
		/*
		 * 第一个案例
		 */
		int i = 0;
		do{
			System.out.println("xiaoniu");
			i++;
		}while(i<5);
		
		/*
		 * 1.提示用户输入密码，用户输入密码，如果用户输入的不等于123，回答提示，如果输入123，显示成功
		 */
		Scanner sc = new Scanner(System.in);
		int password;
		do {
			System.out.println("请输入密码");
			password = sc.nextInt();
		}while(1234!=password);
		System.out.println("登陆成功1234");
		
		/*
		 * 字符串相等
		 */
		Scanner sc1 = new Scanner(System.in);
		String password1;
		do {
			System.out.println("请输入密码");
			password1 = sc1.nextLine();
		}while(!"abcd".equals(password1));
		System.out.println("登陆成功abcd");
	}

}
