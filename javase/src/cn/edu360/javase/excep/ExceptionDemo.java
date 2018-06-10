package cn.edu360.javase.excep;

import java.text.SimpleDateFormat;

/**
 * Throwable :所有错误和异常的超类
 * 		Error 严重的错误，一般由java虚拟机引起，程序 不可控
 * 		Exception 
 * 			运行时异常 int i = 1/0
 * 			编译时异常 new  SimpleDateFormat().parse("");
 * JVM 默认处理方案
 * 		1.程序终止
 * 		2.会打印错误信息
 * 
 * @author Liu Ming
 * @createdTime 2018年4月29日 下午9:47:26
 */
public class ExceptionDemo {

	public static void main(String[] args) {
		int i = 1/0;
		//new  SimpleDateFormat().parse("");
		System.out.println(12);
	}

}
