package cn.edu360.javase.method;
/**
 * 参数个数或者参数类型不同即可，与返回值类型无关
 * @author Liu Ming
 * @createdTime 2018年4月11日 下午4:27:43
 */
public class MethodOverLoadDemo {

	public static void main(String[] args) {
		System.out.println(getSum(1,2,3));
		System.out.println(getSum(2.3,213.2,23.4));
	}
	
	public static int getSum(int a,int b) {
		return a+b;
		
	}
	
	public static int getSum(int a,int b,int c) {
		return a+b+c;
		
	}
	
	public static double getSum(double a,double b,double c) {
		return a+b+c;
	}

}
