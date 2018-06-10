package cn.edu360.javase.oo;
/*
 * 一个java文件可以定义多个类，但是只能有一个类是public修饰，并且这个类和文件名一致，main方法也要定义在这个类中
 * 
 */
public class Teacher {
 
	String name;
	
	int age;
	
	String subject;
	
	/*
	 * 成员方法
	 */
	public void teach() {
		System.out.println(name+"正在上课"+subject);
	}
	
	/*
	 * main方法中如果想调用外边非static的变量和方法，使用对象调用
	 */
	public static void main(String[] args) {
		Teacher t = new Teacher();
		Teacher t1 = new Teacher();
		
		t.name = "刘老师";
		t.age = 18;
		t.subject = "java基础";
		
		System.out.println("name="+t.name+"，age="+t.age+"，subject="+t.subject);
		t.teach();
		System.out.println(t);//cn.edu360.java.oo.Teacher@70dea4e
		
		
		System.out.println(t1.name);//null
		System.out.println(t1.age);//0
		System.out.println(t1.subject);//null
		System.out.println(t1);//cn.edu360.java.oo.Teacher@5c647e05
		
	}

}
