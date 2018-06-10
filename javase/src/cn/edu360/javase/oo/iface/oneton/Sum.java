package cn.edu360.javase.oo.iface.oneton;

public class Sum implements OneToN {

	

	/* (non-Javadoc)
	 * 1+2+3+...+n
	 * @see cn.edu360.java.se.oo.iface.oneton.OneToN#dispose(int)
	 */
	@Override
	public int dispose(int n) {
//		int sum = 0;
//		for (int i = 1; i <= n; i++) {
//			sum+=i;
//		}
//		return sum;
		
		return getSum(n);
	}
	
	/*
	 * 递归算法
	 */
	public int getSum(int n) {
		if(n==1) {
			return 1;
		}else {
			return n+getSum(n-1);
		}
	}

}
