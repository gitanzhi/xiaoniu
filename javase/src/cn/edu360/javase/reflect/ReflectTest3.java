package cn.edu360.javase.reflect;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

import org.junit.Test;

public class ReflectTest3 {
	public static void main(String[] args) {
		
	}
	
	@Test
	public void test() {
		Person person = new Person();
		
		setProperty(person, "name", "张三");
		System.out.println(person);
	}
	
	public void setProperty(Object obj,String propertyName,Object value) {
		try {
			PropertyDescriptor pd = new PropertyDescriptor(propertyName, obj.getClass());
			Method writeMethod = pd.getWriteMethod();
			writeMethod.invoke(obj, value);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
