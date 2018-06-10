package cn.edu360.javase;
/**
 * break中断;
 * continue中断;
 * @author Liu Ming
 * @createdTime 2018年4月10日 下午6:10:20
 */
public class BreakDemo {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			if(i==7) {
				break;
				
			}
			if(i==3) {
				continue;
			}
			System.out.println(i);
		}
		
		
		
	}

}
