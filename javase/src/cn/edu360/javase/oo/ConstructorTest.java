package cn.edu360.javase.oo;

import com.sun.org.apache.xml.internal.utils.SuballocatedByteVector;

public class ConstructorTest {

	int a;
	
	int b;
	
	public ConstructorTest() {
		
	}
	
	public ConstructorTest(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int add()
	{
		return a+b;
	}
	
	public int sub() {
		return a-b;
	}
	
	public int mul()
	{
		return a*b;
	}
	
	public String div() {
		if(b==0) {
			return "除数不能为0";
		}
		return a/b+"";
	}
	
	public static void main(String[] args) {
		ConstructorTest c1 = new ConstructorTest(4,2);
		System.out.println(c1.add());
		System.out.println(c1.sub());
		System.out.println(c1.mul());
		System.out.println(c1.div());
		
		System.out.println(MathUtil.add(3, 7));
		System.out.println(MathUtil.sub(2, 3));
		System.out.println(MathUtil.mul(2, 2));
		System.out.println(MathUtil.div(2, 8));
	}
}
