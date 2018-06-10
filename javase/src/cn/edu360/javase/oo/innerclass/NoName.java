package cn.edu360.javase.oo.innerclass;
/**
 * 匿名内部类
 * 前提：必须继承一个父类或者实现一个接口
 *	 new 类名或者接口(){
 *		重写或实现的方法
 *	}
 * 注意：
 *  没有构造方法
 *  不能是抽象类
 * @author liuming
 * @date 2018年4月15日  下午3:07:15
 */
public class NoName {
	public static void main(String[] args) {
		A a = new B();
		a.a();
		
		
		new A() {
			public void a(){
				System.out.println("匿名内部类的a");
			}
		}.a();
		
		new C() {
			public void c() {
				System.out.println("匿名内部类的c");
			}
		}.c();
		
		new D() {
			public void d() {
				System.out.println("匿名d");
			}
		}.d();
	}
}

class B implements A{
	public void a() {
		System.out.println("a");
	}
}

interface A {
	void a();
}

abstract class C{
	public abstract void c();
}

class D{
	public void d() {
		System.out.println("d");
	}
}