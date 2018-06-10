package cn.edu360.javase.proxy.staticprooxy;

public class Test1 {
	public static void main(String[] args) {
		Monkey m = new Monkey();
		m.doYou();
		
		Kongkong k = new Kongkong(m);
		k.doYou();
	}
}
