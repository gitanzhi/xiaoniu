package cn.edu360.javase.oo;

public class MathUtil {
	
	public static int add(int a,int b)
	{
		return a+b;
	}
	
	public static int sub(int a,int b) {
		return a-b;
	}
	
	public static int mul(int a,int b)
	{
		return a*b;
	}
	
	public static String div(int a,int b) {
		if(b==0) {
			return "除数不能为0";
		}
		return a/b+"";
	}
}
