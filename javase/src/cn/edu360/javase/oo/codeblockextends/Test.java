package cn.edu360.javase.oo.codeblockextends;

/**
 *
 * @author liuming
 * @date 2018年4月15日  下午2:27:18
 */
public class Test {

	public static void main(String[] args) {
		Son A = new Son();
	}

}

class Parent{
	{
		System.out.println("A");
	}
	static {
		System.out.println("B");
	}
	/**
	 * 
	 */
	public Parent() {
		System.out.println("C");
	}
}

class Son extends Parent{
	{
		System.out.println("D");
	}
	static {
		System.out.println("E");
	}
	/**
	 * 
	 */
	public Son() {
		System.out.println("F");
	}
}
