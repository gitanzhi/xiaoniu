package cn.edu360.javase.reflect;

import java.lang.reflect.Method;

public class ReflectMethodDemo {
	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("cn.edu360.javase.reflect.Person");
		
		//获取本类和父类的所有public 方法
		Method[] methods = clazz.getMethods();
		for (Method method : methods) {
			System.out.println(method);
		}
		System.out.println("-------------------");
		
		//没有的方法，无父类的
		Method[] declaredMethods = clazz.getDeclaredMethods();
		for (Method method : declaredMethods) {
			System.out.println(method);
		}
		System.out.println("-----------------");
		
		
		Object o = clazz.newInstance();
		
		Method m1 = clazz.getMethod("toString",null);//参数类型
		Object o1 = m1.invoke(o, null);//调用，实际的参数
		System.out.println(o1);
		
		Method m2 = clazz.getDeclaredMethod("test",String.class);
		m2.setAccessible(true);
		Object o2 = m2.invoke(o, "zhang");
		System.out.println(o2);
	}
}
