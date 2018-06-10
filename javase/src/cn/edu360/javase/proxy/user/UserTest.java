package cn.edu360.javase.proxy.user;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class UserTest {

	public static void main(String[] args) {
		IuserDao dao = new UserDaoImpl();
		
		//3。获得代理对象
		
		IuserDao newProxyInstance = (IuserDao)Proxy.newProxyInstance(dao.getClass().getClassLoader(), dao.getClass().getInterfaces(), new MyInvocationHandle(dao));
		
		boolean b1 = newProxyInstance.save();
		boolean b2 = newProxyInstance.update();
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println("----------------------");
		
		IuserDao newProxyInstance2 = (IuserDao)Proxy.newProxyInstance(dao.getClass().getClassLoader(),dao.getClass().getInterfaces(),new InvocationHandler() {

			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println("匿名内部类记录开始日志");
				Object o = method.invoke(dao, args);
				System.out.println("结束日志");
				return o;
			}
			
		});
		

		boolean b3 = newProxyInstance2.save();
		boolean b4 = newProxyInstance2.update();
		
		System.out.println(b3);
		System.out.println(b4);
	}

}

//shixian 子类
class MyInvocationHandle implements InvocationHandler{
	private Object obj;
	
	public MyInvocationHandle(Object obj) {
		super();
		this.obj = obj;
	}
	
	public MyInvocationHandle() {
	
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("记录开始日志");
		Object o = method.invoke(obj, args);
		System.out.println("结束日志");
		return o;
	}
	
}
