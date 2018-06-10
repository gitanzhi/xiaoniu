package cn.edu360.javase;

import java.util.Scanner;

/**
 * if(){
 * 
 * }else{
 * 
 * }
 * @author Liu Ming
 * @createdTime 2018年4月10日 下午4:31:50
 */
public class IfDemo {

	public static void main(String[] args) {
		//如果if后边没有大括号，控制的范围到第一个分号为止
		if(3>4) 
			System.out.println("ni");
		System.out.println("hao");
		
		/*
		 * 第一个案例
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("输入第一个数");
		int sc1 = sc.nextInt();
		System.out.println("请输入第二个数");
		int sc2 = sc.nextInt();
		if(sc1==sc2) {
			System.out.println("相等");
		}else {
			System.out.println("不相等");
		}
		
		/*
		 * 第二个案例
		 */
		if(sc2%2==0) {
			System.out.println("是偶数");
		}else {
			System.out.println("是奇数");
		}
		
		/*
		 * 第三个案例 
		 */
		
		if(sc1>0) {
			System.out.println("是正数");
		} else if (sc1==0){
			System.out.println("是0");
		} else {
			System.out.println("是负数");
		}
		
	
		System.out.println("请输入成绩");
		int sc3 = sc.nextInt();
		if(sc3>90&&sc3<=100) {
			System.out.println("优秀");
		}else if(sc3>=60 && sc3<=90) {
			System.out.println("及格");
		}else if(sc3>0&& sc3<60) {
			System.out.println("不及格");
		}else {
			System.out.println("系统输入错误");
		}
	}

}
