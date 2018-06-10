package cn.edu360.javase.method;

public class MethodDemo1 {
	
	/*
	 * main 只能调用static修饰的方法和变量
	 */
	public static void main(String[] args) {
		System.out.println(equals(3,4));
		System.out.println(equals(3l,4l));
		System.out.println(equals((byte)3,(byte)4));
		System.out.println(equals((byte)3,3l));
	}
	
	public static boolean equals(byte b1,byte b2) {
		System.out.println("调用的byte");
		return b1==b2?true:false;
	}
	
	public static boolean equals(short s1,short s2) {
		System.out.println("调用的short");
		return s1==s2?true:false;
	}
	
	public static boolean equals(int i1,int i2) {
		System.out.println("调用的int");
		return i1==i2?true:false;
	}
	
	public static boolean equals(long l1,long l2) {
		System.out.println("调用的long");
		return l1==l2?true:false;
	}

}
