package cn.edu360.javase.proxy.test;

public class Test1 {
	public static void main(String[] args) {
		MyProxy proxy = new MyProxy(new UserServiceImpl(), new MyAdvice());
		//生成代理对象
		UserService userService= (UserService)proxy.getProxy();
		userService.add();
		userService.delete();
	}
}
