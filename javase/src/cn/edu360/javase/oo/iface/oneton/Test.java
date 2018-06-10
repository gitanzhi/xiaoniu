package cn.edu360.javase.oo.iface.oneton;

/**
 *
 * @author liuming
 * @date 2018年4月15日  下午2:17:38
 */
public class Test {
	public static void main(String[] args) {
		OneToN aN = new Sum();
		System.out.println(aN.dispose(100));
		
		OneToN bN = new Pro();
		System.out.println(bN.dispose(4));
	}
}
