package cn.edu360.javase.oo;

/**
 * static ：static 变量，static 方法 ，static 代码块
 * 区分：
 * 局部变量，成员变量，类变量
 * 静态方法，成员方法，构造方法
 * 
 * 描述static
 * 1.static 可以修饰变量和方法，被static修饰的类和方法是类变量和方法
 * 2.static修饰的变量和方法是随着类加载存在，优先于对象
 * 3.静态方法中，只能调用外部使用static修饰的变量和方法
 * 4.static 修饰的变量和方法可以使用类名调用
 * @author Liu Ming
 * @createdTime 2018年4月14日 下午5:31:46
 */
public class StaticDemo {
	String name;//成员变量
	
	static int count;//静态变量
	
	public StaticDemo() {
		
	}
	
	public StaticDemo(String demo) {//有参数的构造方法
		
	}
	
	public void eat(String food) { //成员方法
		int a = 10;//局部变量
		System.out.println("正在吃"+food);
	}
	
	public static int add(int a,int b) {//静态方法
		return a+b;
	}
	
	public static void main(String[] args) {
		StaticDemo s1 = new StaticDemo();
		StaticDemo s2 = new StaticDemo();
		s1.count = 20;
		s2.count = 50;
		System.out.println(s1.count);//共享
		System.out.println(StaticDemo.count);
		
		System.out.println(StaticDemo.add(2, 4));
	}
}
