package cn.edu360.javase.proxy.staticprooxy;

public class Kongkong implements Animal{
	Animal m;
	
	public Kongkong() {
		super();
	}
	
	public Kongkong(Monkey m) {
		super();
		this.m = m;
	}
	
	public void doYou() {
		System.out.print("金箍鲁棒");
		m.doYou();//执行的是具体实现类的方法
	}
}
