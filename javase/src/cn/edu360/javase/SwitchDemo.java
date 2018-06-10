package cn.edu360.javase;

import java.util.Scanner;

/**
 * switch 循环
 * 取值 byte short int char jdk7以后可以string
 * @author Liu Ming
 * @createdTime 2018年4月11日 下午2:44:04
 */
public class SwitchDemo {

	public static void main(String[] args) {
		/*
		 * 案例1：输入1-7代表星期一到日
		 */
		System.out.println("请输入数字1-7");
		Scanner sc = new Scanner(System.in);
		int week = sc.nextInt();
		switch(week) {
			case 1:
				System.out.println("星期一");
				break;
			case 2:
				System.out.println("星期二");
				break;
			case 3:
				System.out.println("星期三");
				break;
			case 4:
				System.out.println("星期四");
				break;
			case 5:
				System.out.println("星期五");
				break;
			case 6:
				System.out.println("星期六");
				break;
			case 7:
				System.out.println("星期日");
				break;
			default:
				System.out.println("输入不合法");
				break;
		}
		/*
		 * 案例2 输入1-12 判断季节
		 */
		System.out.println("输入一个月份");
		int month = sc.nextInt();
		switch(month) {
			case 3:
			case 4:
			case 5:
				System.out.println("春季");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("夏季");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("秋季");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("冬季");
				break;
		}
		
	}

}
