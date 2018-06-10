package cn.edu360.javase.proxy.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyProxy implements InvocationHandler{
	
	Object target;//被代理类
	Object advice;//代理类
	
	
	public MyProxy(Object target, Object advice) {
		super();
		this.target = target;
		this.advice = advice;
	}
	
	public Object getProxy() {
		return Proxy.newProxyInstance(MyProxy.class.getClassLoader(), target.getClass().getInterfaces(),  this);
	}


	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Method m1 = advice.getClass().getMethod("open", null);
		m1.invoke(advice, args);
		String name = method.getName();
		System.out.println(name);
		method.invoke(target, args);
		return null;
	}
	
}
