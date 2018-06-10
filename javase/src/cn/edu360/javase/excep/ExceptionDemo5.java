package cn.edu360.javase.excep;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * throws 将异常给上层调用者，throws 后边跟着异常的类名 ，用在方法后面的抛出，可以用多个,分开
 * @author Liu Ming
 * @createdTime 2018年4月29日 下午10:20:10
 */
public class ExceptionDemo5 {

	public static void main(String[] args) throws ParseException {
		new SimpleDateFormat().parse("");
		System.out.println(12);
		
		try {
			test();
		} catch (ParseException e) {
			e.printStackTrace();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}
	
	public static void test() throws ParseException,ArithmeticException {
		new SimpleDateFormat().parse("");
		int i = 1/0;
	}

}
