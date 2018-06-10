package cn.edu360.javase.oo.iface;

/**
 *interface 不是类，是接口
 * 接口不能初始化对象，使用向上转型
 * 
 * @author liuming
 * @date 2018年4月15日  下午1:29:09
 */
public interface InterfaceDemo {
	int a = 100;//接口的常量隐式使用public static final
	
	//没有构造方法
	
	//接口的方法都是抽象方法,使用public abstract
	void eat();
	
}

interface FlyDemo{
	void fly();
}

abstract class Demo implements InterfaceDemo{
	public  abstract void sleep();
}

class Demo1 extends Demo implements InterfaceDemo,FlyDemo{

	/* (non-Javadoc)
	 * @see cn.edu360.java.se.oo.iface.InterfaceDemo#eat()
	 */
	@Override
	public void eat() {
		System.out.println("eat");
	}

	/* (non-Javadoc)
	 * @see cn.edu360.java.se.oo.iface.Demo#sleep()
	 */
	@Override
	public void sleep() {
		System.out.println("sleep");
	}

	/* (non-Javadoc)
	 * @see cn.edu360.java.se.oo.iface.FlyDemo#fly()
	 */
	@Override
	public void fly() {
		System.out.println("fly");
	}
	
}

interface Inter1{
	
}

interface Inter2{
	
}
//支持多继承
interface Inter3 extends Inter1,Inter2{
	
}