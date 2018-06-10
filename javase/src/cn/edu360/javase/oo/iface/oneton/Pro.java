package cn.edu360.javase.oo.iface.oneton;

/**
 *
 * @author liuming
 * @date 2018年4月15日  下午2:11:34
 */
public class Pro implements OneToN {

	/* (non-Javadoc)
	 * @see cn.edu360.java.se.oo.iface.oneton.OneToN#dispose(int)
	 */
	@Override
	public int dispose(int n) {
		if(n==1) {
			return 1;
		}else {
			return n*dispose(n-1);
		}
	}

}
