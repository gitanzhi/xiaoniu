 package cn.edu360.javase.excep;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * try catch
 * try{
 * 	可能出现问题的代码
 * }catch(异常类名 参数){
 * 	处理方法
 * }
 * @author Liu Ming
 * @createdTime 2018年4月29日 下午9:55:49
 */
public class ExceptionDemo2 {

	public static void main(String[] args) {
		//冗余
		try {
			int i = 1/0;
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("除数不能为0");
		}
		System.out.println(12);
		
		try {
			new SimpleDateFormat().parse("");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(12);
	}
	
	public static void test() {
		try {
			int i = 1 / 0;
			new SimpleDateFormat().parse("");
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("除数不能为0");
			//各自处理异常
		} catch (ParseException e) {
			e.printStackTrace();
			//各自处理
//		} catch(ParseException | ArithmeticException e) {
//			//1.7以后可以通过竖线一起，但是不能出现子父类关系
//		} catch (Exception e) {
			//统一处理异常放最后 
			e.printStackTrace();
		}
		
		
	}

}
