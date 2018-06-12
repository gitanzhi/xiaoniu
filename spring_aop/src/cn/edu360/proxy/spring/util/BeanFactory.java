package cn.edu360.proxy.spring.util;

import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Properties;

public class BeanFactory {
	static Properties p ;
	
	static {
		try {
			p = new Properties();
			p.load(BeanFactory.class.getClassLoader().getResourceAsStream("spring.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static <T> T getInstance(Class clazz) throws Exception {
		String key = clazz.getSimpleName();
		String value = p.getProperty(key);
		Class instanceClass = Class.forName(value);
		Object obj = instanceClass.newInstance();
		
		String isPrint = p.getProperty(key+".printLog");
		if(isPrint!=null&&!"".equals(isPrint)&&"true".equals(isPrint)) {
			Object proxyInstance = Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new InvocationHandler() {
				
				@Override
				public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
					System.out.println("打印开始日志");
					Object o = method.invoke(obj, args);
					System.out.println("结束日志");
					return o;
				}
			});
			return (T)proxyInstance;
		}
		return (T)obj;
	}
	
	public static void main(String[] args) {
		System.out.println(BeanFactory.class.getSimpleName());
	}
}
