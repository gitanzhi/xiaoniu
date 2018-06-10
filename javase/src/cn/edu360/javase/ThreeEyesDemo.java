package cn.edu360.javase;
/**
 * 三目运算符
 * @author Liu Ming
 * @createdTime 2018年4月9日 下午9:06:42
 */
public class ThreeEyesDemo {

	public static void main(String[] args) {
		int a=30;
		int b=40;
		int max = a>b?a:b;
		System.out.println("最大值为："+max);
		//a>b?System.out.println(a):System.out.println(b);不可以
	}

}
