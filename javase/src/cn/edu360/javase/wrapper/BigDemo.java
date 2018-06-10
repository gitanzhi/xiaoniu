package cn.edu360.javase.wrapper;

import java.math.BigInteger;

/**
 * 数组可以装基本数据类型的，也可以装引用数据类型的 
 * @author liuming
 * @date 2018年4月15日  下午5:24:34
 */
public class BigDemo {

	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		BigInteger bigInteger = new BigInteger("10");
		BigInteger bigInteger2  = new BigInteger("2");
	
		System.out.println(bigInteger.add(bigInteger2));
		System.out.println(bigInteger.subtract(bigInteger2));
		System.out.println(bigInteger.multiply(bigInteger2));
		System.out.println(bigInteger.divide(bigInteger2));
		BigInteger[]  dar =  bigInteger.divideAndRemainder(bigInteger2);
		System.out.println(dar[0]);
		System.out.println(dar[1]);
		
	}

}
