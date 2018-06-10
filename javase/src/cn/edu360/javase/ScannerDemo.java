package cn.edu360.javase;
import java.util.Scanner;
/**
 * 键盘录入
 * @author Liu Ming
 * @createdTime 2018年4月9日 下午9:17:43
 */
public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("亲输入一个数字:");
		int i = sc.nextInt();
		System.out.println("您输入的数字为"+i);
		
		double d = sc.nextDouble();//小数		
		float f = sc.nextFloat();
		String str = sc.nextLine(); 
	}

}
