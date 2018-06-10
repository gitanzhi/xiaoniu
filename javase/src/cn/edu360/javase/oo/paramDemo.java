package cn.edu360.javase.oo;
/*
 * 形参和实参
 * 基本数据类型的形式参数的改变不会引起实际参数的改变
 * 引用数据类型的形式参数的改变会引起实际参数的改变
 */
public class paramDemo {

	public static void main(String[] args) {
		int a = 10;
		change(a);
		System.out.println(a);
		
		Teacher teacher = new Teacher();
		teacher.age = 10;
		changeAge(teacher);
		System.out.println(teacher.age);
		
		/*
		 * 示例
		 */
		int b = 20;
		swap(a, b);
		System.out.println("a="+a+"b="+b);//基本数据类型不会改变
		
		/*
		 * 匿名对象 调用学生的睡觉方法
		 */
		Student student = new Student();
		student.sleep();
		
		new Student().sleep();
	}
	
	public static void change(int a) {
		a = 200;
	}
	
	public static void changeAge(Teacher t) {
		t.age = 200;
	}
	
	public static void swap(int a,int b) {
		int temp = a;
		a = b;
		b = temp;
	}

}
