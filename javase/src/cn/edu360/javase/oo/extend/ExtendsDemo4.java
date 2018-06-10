package cn.edu360.javase.oo.extend;
/**
 * 子类重写父类的，访问权限不能更低
 * 父类的私有方法不能重写
 * 子类重写静态的也必须是静态的
 * @author Liu Ming
 * @createdTime 2018年4月14日 下午7:12:14
 */
public class ExtendsDemo4 {
		
	public static void main(String[] args) {
		Son1 son1 = new Son1();
		System.out.println(son1.name);//son
		
		Father1 father1  = new Father1();
		System.out.println(father1.name);
		
		son1.eat();
		son1.sleep();
	}
}

class Son1 extends Father1{
	
	String name = "son";
	
	public int age;
	
	public void sleep() {
		System.out.println("son在睡觉");
	}
}

class Father1{
	
	String name = "father";
	
	private int age;
	
	public void eat() {
		System.out.println("father 在吃饭");
	}
	
	public void sleep() {
		System.out.println("father 在睡觉");
	}
}
