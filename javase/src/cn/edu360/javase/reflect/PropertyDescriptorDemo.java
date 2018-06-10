package cn.edu360.javase.reflect;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

public class PropertyDescriptorDemo {
	
	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("cn.edu360.javase.reflect.Person");
		
		Person p = (Person) clazz.newInstance();
		
		PropertyDescriptor pd = new PropertyDescriptor("name", clazz);
		
		
		Method writeMethod = pd.getWriteMethod();
		writeMethod.invoke(p, "张三");
		System.out.println(p);
		
		Method readMethod = pd.getReadMethod();
		String name = (String)readMethod.invoke(p, null);
		
		System.out.println(name);
	}
}
