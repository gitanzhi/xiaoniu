package cn.edu360.javase.array;

import java.util.Scanner;

/**
 * 查找index
 * @author liuming
 * @date 2018年4月15日  下午4:19:59
 */
public class ArrayDemo5 {

	public static void main(String[] args) {
		int[] arr = new int[] {88,33,45,23,45,35};
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个数字");
		int num = scanner.nextInt();
		int location = -1;
		for (int i = 0; i < arr.length; i++) {
			if(num==arr[i]) {
				location = i;
				break;
			}
		}
		if(location==-1) {
			System.out.println("您查找的不存在");
		}else {
			System.out.println("您查找的"+location);
		}
	}

}
