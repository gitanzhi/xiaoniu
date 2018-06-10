package cn.edu360.javase.oo;

public class ProductTest {

	public static void main(String[] args) {
		//set 赋值
		Product p1 = new Product();
		p1.setProId("0001");
		p1.setProName("农夫山泉");
		p1.setProImg("www.baidu.com/img/nfsq.png");
		p1.setProPrice(2.00);
		p1.setProCount(22);
		p1.setProDesc("我们是大自然的搬运工");
		p1.show();
		
		//构造方法
		Product p2 = new Product("0002","清风手指",300,"www.baidu.com/qfsz.png",10.80,"就是好用");
		p2.show();
	}

}
