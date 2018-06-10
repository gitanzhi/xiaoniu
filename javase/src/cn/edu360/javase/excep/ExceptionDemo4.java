package cn.edu360.javase.excep;

public class ExceptionDemo4 {
	public static void main(String[] args) {
		try {
			int i = 1/0;
		} catch (ArithmeticException e) {
			e.printStackTrace();
			//System.exit(0);
		} finally {
			System.out.println("over");
		}
	}
}
