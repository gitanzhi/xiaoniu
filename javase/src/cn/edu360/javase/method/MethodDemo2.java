package cn.edu360.javase.method;

import java.util.Scanner;

public class MethodDemo2 {
	
	public static double getPrice(int proId,double price) {
		if(proId==1) {
			return price-3;
		}else if(proId==2) {
			return price-2;
		}else {
			return price-6;
		}
	}
	
	public static String getProName(int proId) {
		if(proId==1) {
			return "雪碧";
		}else if(proId==2) {
			return "矿泉水";
		}else {
			return "红牛";
		}
	}
	
	public static String getProPrice(int proId) {
		if(proId==1) {
			return "3元";
		}else if(proId==2) {
			return "2元";
		}else {
			return "6元";
		}
	}
	
	public static String getResult(double yue,int proId,double price) {
		 if(yue<0) {
			 return "余额不足";
		 }else {
			 return "您购买的商品"+getProName(proId)+"价格是"+getProPrice(proId)+"，实收"+price+"，找零"+yue;
		 }
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请选择商品编号 1：雪碧3元 2：矿泉水2元 3.红牛6元");
		int proId = sc.nextInt();
		System.out.println("请输入金额");
		double price  = sc.nextDouble();
		if(proId>3||proId<1) {
			System.out.println("您购买的商品不存在");
			return;
		}
		
		double yue = getPrice(proId,price);//获取余额
		String result  = getResult(yue,proId,price);
		System.out.println(result);
		
	}

}
