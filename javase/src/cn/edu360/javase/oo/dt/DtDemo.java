package cn.edu360.javase.oo.dt;
/**
 * 向上转型和向下转型
 * 父类的调用指向子类的对象
 * @author Liu Ming
 * @createdTime 2018年4月14日 下午7:54:42
 */
public class DtDemo {

	public static void main(String[] args) {
		Animal am = new Cat();
		am.eat();//猫仔吃饭,子父类都有调用自己的
		am.sleep();//动物睡觉, 静态调用父类的 
		am.run();//动物奔跑 调用父类的
		System.out.println(am.num);//10
		System.out.println(am.age);//20
		//am.catchMouse();//报错
		//System.out.println(am.name);//报错
		Cat cat  = (Cat) am;
		cat.eat();//猫仔吃饭
		cat.sleep();//猫仔睡觉
		cat.run();//动物奔跑
		cat.catchMouse();//猫在抓老鼠
	}

}

class Animal{
	int num = 10;
	
	static int age = 20;
	
	public void eat() {
		System.out.println("动物吃饭");
	}
	
	public static void run() {
		System.out.println("动物奔跑");
	}
	
	public static void sleep() {
		System.out.println("动物睡觉");
	}
}

class Cat extends Animal{
	int num = 80;
	
	static int age = 90;
	
	String name = "tomcat";
	
	public void eat() {
		System.out.println("猫仔吃饭");
	}
	
	public static void sleep() {
		System.out.println("猫仔睡觉");
	}
	
	public void catchMouse() {
		System.out.println("猫在抓老鼠");
	}
}