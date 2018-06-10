package cn.edu360.javase.oo;
/**
 * 长方形调用  -- 成员变量和成员方法
 * @author Liu Ming
 * @createdTime 2018年4月14日 下午3:13:33
 */
public class RectangleDemo {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.length = 12;
		r.width = 3;
		System.out.println("周长为"+r.getTotalLength());
		System.out.println("面积为"+r.getArea());
		
		
		Rectangle r1 = new Rectangle(10,4);
		System.out.println("周长为"+r1.getTotalLength());
		System.out.println("面积为"+r1.getArea());
	}

}
