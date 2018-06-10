package cn.edu360.javase.oo;

public class CodeBlockDemo {
	
	static int count = 0;
	/*
	 * 静态代码块在类加载的时候执行，执行1次
	 * 比如加载一些证书之类
	 */
	static {
		System.out.println("正在执行静态代码块");
	}
	
	/*
	 * 构造代码块
	 */
	{
		count+=1;
		System.out.println("正在执行构造代码块");
	}
	
	public CodeBlockDemo() {
		System.out.println("正在执行无参数构造方法");
	}
	
	public CodeBlockDemo(String s) {
		this();
		System.out.println("正在执行有参数构造方法");
	}
	
	/*
	 * 局部代码块
	 * 代码块中创建的变量只在代码块中有效，执行完就被释放
	 */
	public void eat() {
		
		{
			int age = 80;//证明执行完就没有用了
		}
		
		int age = 10;
		System.out.println("age="+age);
	}
	
	
	public static void main(String[] args) {
		//CodeBlockDemo c = new CodeBlockDemo("aaa");
		//c.eat();
		//new CodeBlockDemo("21");
		//new CodeBlockDemo();
		//new CodeBlockDemo("aa");
		System.out.println(count);
		
	}
}
