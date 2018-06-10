package cn.edu360.javase;
/**
 * For循环
 * @author Liu Ming
 * @createdTime 2018年4月10日 下午4:55:39
 */
public class ForDemo {

	public static void main(String[] args) {
		/*
		 * 第一个案例
		 */
		for(int i=0 ;i<100;i++) {
			System.out.println(i);
		}
		
		/*
		 * 第二个案例 
		 */
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += i;
		}
		System.out.println("和为："+sum);
		
		/*
		 * 第三个案例
		 */
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < 100; i++) {
			if(i%2==0) {
				sum1 += i;
			}else {
				sum2 += i;
			}
		}
		System.out.println("奇数："+ sum1);
		System.out.println("偶数："+ sum2);
		
		/*
		 * 第四个案例
		 */
		
		int count3 = 0;
		int count5 = 0;
		int count7 = 0;
		for (int i = 1; i <= 1000; i++) {
			if(i%3==2) {
				count3 +=1;
			}else if(i%5==3) {
				count5+=1;
			}else if(i%7==2) {
				count7+=1;
			}
		}
		System.out.println("对3取余2:"+count3+"对5整除余3:"+count5+"对7整除余2:"+count7);
		
		/*
		 * 第五个案例 打印四行五列
		 */
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		 * 第六个案例 99乘法表
		 */
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+"*"+i+"="+i*j+"\t");
			}
			System.out.println();
		}
	}

}
