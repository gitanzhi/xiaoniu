package cn.edu360.javase.reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;

import org.junit.Test;

/**
 * 给定string集合，向往里边加入int类型数据
 * @author Liu Ming
 * @createdTime 2018年5月14日 下午3:31:55
 */
public class ReflectTest2 {
	public static void main(String[] args) throws Exception, SecurityException {
		
	}
	
	//junit 测试
	@Test
	public void test() throws Exception, SecurityException {
		ArrayList<String> list = new ArrayList<String>();
		list.add("xx");
		list.add("yy");
		
		
		Class clazz = list.getClass();
		Method method = clazz.getMethod("add", Object.class);
		method.invoke(list, 12);
		method.invoke(list, 213.2323);
		System.out.println(list);
	}
}
