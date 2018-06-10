package cn.edu360.javase.reflect;

import java.lang.reflect.Field;

public class ReflectFieldDemo {
	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("cn.edu360.javase.reflect.Person");
		Field[] fields = clazz.getFields();//类或接口访问的public字段，父类的
		for (Field field : fields) {
			System.out.println(field);
		}
		
		System.out.println("-------------------");
		
		Field[] dFields = clazz.getDeclaredFields();//获取接口定义的所有属性值包括static
		for (Field field : dFields) {
			System.out.println(field);
		}
		
		Object o = clazz.newInstance();//获取一个对象
		System.out.println(o);
		
		Field f1 = clazz.getField("name");//获取public的
		f1.set(o,"张三");
		System.out.println(o);
		
		Field f2 = clazz.getDeclaredField("age");//全部的
		f2.setAccessible(true);
		f2.setInt(o, 12);
		System.out.println(o);
		
	}
}
