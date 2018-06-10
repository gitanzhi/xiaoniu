package cn.edu360.javase.oo;

public class MobileTest {

	public static void main(String[] args) {
		Mobile m1 = new Mobile();
		m1.setBrand("苹果");
		m1.setType("ihone X");
		m1.setColor("黄色");
		m1.setPrice(10);
		
		Mobile m2 = new Mobile();
		m2.setBrand("诺基亚");
		m2.setType("白色");
		m2.setColor("8110");
		m2.setPrice(888);
		
		Mobile m3 = new Mobile();
		m3.setBrand("华为");
		m3.setType("mate 10");
		m3.setColor("金色");
		m3.setPrice(888888);
		
		System.out.println("品牌："+m3.getBrand()+",型号："+m3.getType()+",颜色："+m3.getColor()+",价格："+m3.getPrice());
	}

}
