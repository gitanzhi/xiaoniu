package cn.edu360.javase.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyObject2 implements InvocationHandler{
	private Object obj;
	
	
	public ProxyObject2(Object obj) {
		super();
		this.obj = obj;
	}
	
	public ProxyObject2() {
	}


	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("你好，代理");
		Object o = method.invoke(obj, args);
		System.out.println("拜拜，代理");
		return o;
	}

}
