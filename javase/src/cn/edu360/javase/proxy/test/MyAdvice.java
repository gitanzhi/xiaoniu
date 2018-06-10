package cn.edu360.javase.proxy.test;

public class MyAdvice {
	public void open() {
		System.out.println("开启事务");
		
	}
	
	public void commit() {
		System.out.println("提交事务");
	}
}
