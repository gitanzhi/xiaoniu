package cn.edu360.javase.wrapper;

import java.math.BigDecimal;

/**
 *
 * @author liuming
 * @date 2018年4月15日  下午5:31:36
 */
public class BigDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(0.01+0.09);
		BigDecimal bd1 = new BigDecimal("0.09");
		BigDecimal bd2 = new BigDecimal("0.01");
		System.out.println(bd1.add(bd2));
		System.out.println(new BigDecimal("0.08").subtract(new BigDecimal("0.02")));
		System.out.println(new BigDecimal("0.08").multiply(new BigDecimal("0.02")));
		
		BigDecimal bd3 = new BigDecimal("1.0");
		BigDecimal bd4 = new BigDecimal("0.32");
		System.out.println(bd3.divide(bd4, 2,BigDecimal.ROUND_UP));//四舍五入等
		
		
		
		
		
	}

}
