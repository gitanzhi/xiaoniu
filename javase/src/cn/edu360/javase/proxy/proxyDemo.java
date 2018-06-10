package cn.edu360.javase.proxy;

import java.lang.reflect.Proxy;

public class proxyDemo {
	public static void consume(InterfaceDemo i) {
		i.say();
		
	}
	public static void main(String[] args) {
		consume(new RealObject());
		consume(new proxyObject());
		/**
		 * 动态代理
		 * proxy
		 * newProxyInstance
		 * 		(Classloader loader,Class<?>[] interfaces,InvocationHandle h)
		 * loader ，定义代理类的类加载器
		 * interfaces:代理类要实现的接口列表
		 * h 指派方法调用的处理程序
		 */
		System.out.println("-------------------");
		InterfaceDemo i = new RealObject();
		InterfaceDemo i1 = (InterfaceDemo) Proxy.newProxyInstance(InterfaceDemo.class.getClassLoader(), new Class[] {InterfaceDemo.class}, new ProxyObject2(i));
		i1.say();
		System.out.println(i1.getClass().getName());//com.sun.proxy.$Proxy0
		
		
	}
}
