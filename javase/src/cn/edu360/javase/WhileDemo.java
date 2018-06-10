package cn.edu360.javase;
/**
 * While 循环
 * @author Liu Ming
 * @createdTime 2018年4月10日 下午5:43:46
 */
public class WhileDemo {

	public static void main(String[] args) {
		/*
		 * 第一个案例
		 */
		int i = 0;
		while(i<100) {
			System.out.println(i);
			i++;
		}
		
		/*
		 * 第二个案例
		 */
		int money = 0;
		int count = 0;
		while(money<1024) {
			money+=5;
			count++;
		}
		System.out.println("循环了"+count+"次");
		
		/*
		 * 第三个案例
		 */
		int j = 0;
		int doubleSum = 0;
		int singleSum = 0;
		while(j<100) {
			if(j%2==0) {
				doubleSum += j;
			}else {
				singleSum += j;
			}
			j++;
		}
		System.out.println("奇数和"+singleSum+"偶数和为"+doubleSum);
	}

}
