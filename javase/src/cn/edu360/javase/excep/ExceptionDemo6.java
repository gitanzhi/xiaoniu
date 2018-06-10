package cn.edu360.javase.excep;

public class ExceptionDemo6 {

	public static void main(String[] args) {
	
		try {
			test(0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println(12);
	}
	
	public static void test(int b) {
		if(b==0) {
			throw new ArithmeticException("除数为0");
		}
		int i = 1/b;
	} 

}
