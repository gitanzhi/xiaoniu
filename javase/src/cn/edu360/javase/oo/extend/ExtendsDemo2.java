package cn.edu360.javase.oo.extend;

public class ExtendsDemo2 {

	public static void main(String[] args) {
		C c1 = new C(); //我是A，我是B，我是C
		
	}

}

class A{
	public A() {
		System.out.println("我是A");
	}
}

class B extends A{
	public B() {
		System.out.println("我是B");
	}
}
class C extends B{
	public C() {
		System.out.println("我是C");
	}
}
