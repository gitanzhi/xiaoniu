package cn.edu360.javase.reflect;

import java.lang.reflect.Constructor;

/**
 * 使用反射获取类的构造方法
 * @author Liu Ming
 * @createdTime 2018年5月14日 下午12:51:08
 */ 
public class ReflectConstructorDemo {

	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("cn.edu360.javase.reflect.Person");//获取class对象
		
		//获取公共的
		Constructor[] constructors = clazz.getConstructors();//public
		for (Constructor constructor : constructors) {
			System.out.println(constructor);
		}
		
		//获取全部的
		Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
		for (Constructor constructor : declaredConstructors) {
			System.out.println(constructor);
		}
		
		//使用反射创建对象
		Constructor c1 = clazz.getConstructor();//返回public构造方法
		Object o1 = c1.newInstance();
		System.out.println(o1);
		
		//有参数的
		Constructor c2 = clazz.getDeclaredConstructor(String.class,int.class);
		Object o2 = c2.newInstance("张三",28);
		System.out.println(o2);
		
		//强制访问
		Constructor c3 = clazz.getDeclaredConstructor(String.class,int.class,char.class);
		c3.setAccessible(true);
		Object o3 = c3.newInstance("张思",12,'男');
		System.out.println(o3);
		
		
		
	}

}
