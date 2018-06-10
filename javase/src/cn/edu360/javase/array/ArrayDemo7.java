package cn.edu360.javase.array;

/**
 *
 * @author liuming
 * @date 2018年4月15日  下午6:17:27
 */
public class ArrayDemo7 {

	/**
	 * 求水仙花数
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 100; i <= 999; i++) {
			int geWei = i%10;
			int shiWei = i/10%10;
			int baiWei = i/100;
			if(i==geWei*geWei*geWei+shiWei*shiWei*shiWei+baiWei*baiWei*baiWei) {
				System.out.println(i);
			}
		}
	}

}
