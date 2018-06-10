package cn.edu360.javase.oo.extend;
/**
 * object 顶层的类
 * 子类只能继承父类的所以非私有成员
 * 不能继承父类的构造方法，但是可以通过super()去访问父类的构造方法
 * 子类所
 * @author Liu Ming
 * @createdTime 2018年4月14日 下午6:09:28
 */
public class ExtendsDemo {
	
	public static void main(String[] args) {
		Teacher t1 = new Teacher();
		t1.eat();
		t1.age = 18;//修改本类的
//		t1.name = "刘老师";
//		t1.subject = "java";
		t1.showAge();
		
		//		Student s1 = new Student();
		//		s1.eat();
		//		s1.age = 20;
		//		s1.name = "小明";
		//		s1.score = 100;
	}
}

class Person{
	String name;
	
	int age = 10;
	
	public void eat() {
		System.out.println("在吃饭");
	}
}

class Teacher extends Person{
	
	String subject;
	
	int age = 20;//优先找子类的
	
	public void showAge() {
		int age = 30;
		System.out.println(age);
		System.out.println(this.age);//本类的对象
		System.out.println(super.age);//父类的对象
	}
	
}

class Student extends Person{
	
	int score;
	
}