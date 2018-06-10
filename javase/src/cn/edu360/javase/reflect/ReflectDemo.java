package cn.edu360.javase.reflect;

public class ReflectDemo {

	public static void main(String[] args) throws Exception {
		//三种获取class对象
		//1.类名
		Class clazz1 = ReflectDemo.class;
		
		//2.通过对象
		ReflectDemo demo = new ReflectDemo();
		Class clazz2 = demo.getClass();
		
		Class clazz3 = Class.forName("cn.edu360.javase.reflect.ReflectDemo");
		
		
		System.out.println(clazz1==clazz2);
		System.out.println(clazz2==clazz3);
		
		
	}

}
