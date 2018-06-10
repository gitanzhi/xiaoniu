package cn.edu360.javase.oo.iface;

/**
 *
 * @author liuming
 * @date 2018年4月15日  下午1:42:06
 */
public class InterfaceDemoTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InterfaceDemo demo1 = new Demo1();
		demo1.eat();
		
		FlyDemo demo2 = new Demo1();
		demo2.fly();
		
		Demo demo3 = new Demo1();
		demo3.eat();
	}

}
