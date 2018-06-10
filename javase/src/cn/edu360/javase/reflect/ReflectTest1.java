package cn.edu360.javase.reflect;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectTest1 {

	public static void main(String[] args) throws Exception {
		Properties p = new Properties();
		InputStream resourceAsStream = ReflectTest1.class.getClassLoader().getResourceAsStream("javase.properties");
		p.load(resourceAsStream);
		
		String className = p.getProperty("class.name");
		String methodName = p.getProperty("method.name");
		
		Class clazz = Class.forName(className);
		Object o = clazz.newInstance();
		Method m1 = clazz.getDeclaredMethod(methodName, null);
		m1.invoke(o, null);
		
		resourceAsStream.close();
		
		
	}

}
