package cn.edu360.javase.proxy.dynamicprooxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Myproxy {
	public static void main(String[] args) {
		UserServiceImpl userServiceImpl = new UserServiceImpl();
		//Object newProxyInstance = Proxy.newProxyInstance(null,null,null);
		UserService newProxyInstance = (UserService)Proxy.newProxyInstance(userServiceImpl.getClass().getClassLoader(), userServiceImpl.getClass().getInterfaces(),new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println("开启");
				method.invoke(userServiceImpl, args);
				return null;
			}
		} );
		newProxyInstance.add();
		
	}
}
