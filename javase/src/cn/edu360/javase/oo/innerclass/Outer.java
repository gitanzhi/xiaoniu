package cn.edu360.javase.oo.innerclass;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class Outer {
	private String name = "123";
	private int age = 10;	
	static char sex = '女';
	
	public static void main(String[] args) {
		//成员内部类调用
		Outer.Inner inner1 = new Outer().new Inner();
		inner1.print();//调用内部的方法
		System.out.println(inner1.height);//访问内部的变量需要用对象调用
		
		//局部内部类调用
		Outer outer = new Outer();
		outer.method();
		
		//静态内部类调用
		System.out.println(Outer.Inner3.j);//静态的
		System.out.println(new Outer.Inner3().i);//非静态的
		
	}
	
	/*
	 * 成员内部类
	 */
	class Inner{
		private double height = 175;
		int age = 20;
		
		public void print() {
			int age = 30;
			System.out.println(name);//内部可以知道外部的变量
			System.out.println(sex);
			System.out.println(age);
			System.out.println(this.age);
			System.out.println(Outer.this.age);
		}
	}
	/*
	 * 局部内部类，定义在一个方法或者y一个作用域内部的类
	 * 不能被public private static等修饰
	 * 除了method 没有人知道这个类存在
	 */
	public void method() {
		int a = 100;//被final修饰的，1.8不用显示出来
		class Inner2{
			public void print() {
				System.out.println(a);
			}
		}
		Inner2 inner2 = new Inner2();
		inner2.print();
	}
	/*
	 * 作用域内
	 */
	{
		class Inner2{
			
		}
	}
	
	/*
	 * 静态内部类
	 * 调用静态成员 外部类名.内部类名.静态成员
	 * 调用非静态成员   new 外部类.内部类名().非静态成员
	 */
	static class Inner3{
		int i = 300;
		static int j = 200;
		
		public void print() {
			System.out.println(sex);//只能调用外部的用static修饰的变量和方法
		}
	}
}
