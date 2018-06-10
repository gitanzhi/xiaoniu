package cn.edu360.javase.oo;

/**
 * 构造方法
 * @author Liu Ming
 * @createdTime 2018年4月14日 下午3:26:23
 */

public class ConstructorDemo {
	
	String name;
	
	//注意:不要有void
	public ConstructorDemo() {
		//构造方法
		System.out.println("正在调用无参构造方法");
	}
	
	
	public ConstructorDemo(String name) {
		this.name = name;
		this.sleep();
		System.out.println("正在调用有参构造方法");
	}
	
	public void sleep() {
		System.out.println("正在睡觉");
	}
	
	/*
	 * 1.this：this所在的方法正在被哪个对象调用，this就代表哪个对象
	 * 2.this.成员变量   this.成员方法
	 * 3.调用构造方法  this();有参数就是调用有参数构造，无参数就是调用无参数构造方法， 注意：此种方法放在可执行代码的第一行
	 */
	public static void main(String[] args) {
		ConstructorDemo demo = new ConstructorDemo();
		ConstructorDemo demo1 = new ConstructorDemo("aaa");
		
		
		System.out.println(demo1.name);
	}
}
