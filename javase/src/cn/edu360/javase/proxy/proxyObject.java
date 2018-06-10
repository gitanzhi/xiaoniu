package cn.edu360.javase.proxy;
/**
 * 代理者
 */

public class proxyObject implements InterfaceDemo{

	@Override
	public void say() {
		System.out.println("你好，代理");
		new RealObject().say();
		System.out.println("拜拜，代理");
	}
	
}
