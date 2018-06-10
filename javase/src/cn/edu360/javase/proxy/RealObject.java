package cn.edu360.javase.proxy;


public class RealObject implements InterfaceDemo {

	@Override
	public void say() {
		System.out.println("实现接口的方法");
	}

}
