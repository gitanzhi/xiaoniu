package cn.edu360.javase.wrapper;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 *
 * @author liuming
 * @date 2018年4月15日  下午4:52:38
 */
public class WrapperDemo {

	/**
	 * int Integer
	 * byte Byte
	 * short Short
	 * long Long
	 * char charactor
	 * float Float
	 * double Double
	 * booleal Boolean
	 * @param args
	 */
	public static void main(String[] args) {
		//int 转化为包装类
		int i = 100;
		Integer integer1 = new Integer(i);
		
		//包装类转化为int,
		int i2 = integer1.intValue();
		
		//jdk5后可以自动转化
		Integer integer2 = i;
		int i3 = integer1;
	
		//字符串转int
		String string = "123";
		int i4 = Integer.parseInt(string);
		System.out.println(i4+1);
		
		System.out.println(new Integer(string)+1);
		
		//int 转化为字符串
		int i5 = 123;
		String str = ""+i5;
		String string2 = new Integer(i5).toString();
		System.out.println(string2+1);
		
		
	}

}
