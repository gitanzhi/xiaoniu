package cn.edu360.javase.oo.dt.shape;import org.w3c.dom.css.CSSPrimitiveValue;
import org.w3c.dom.css.Rect;

public class ShapeTest {

	public static void main(String[] args) {
		Shape r = new Rectangle(10,4);
		System.out.println("面积："+r.getArea());
		System.out.println("周长："+r.getTotalLength());
		
		Shape c = new Circle(3);
		System.out.println("周长："+c.getTotalLength());
		System.out.println("面积："+c.getArea());
		
		
		print(new Rectangle(2,1));
		print(new Circle(4));
		
	}
	
	public static void print(Shape s) {
		System.out.println("周长："+s.getTotalLength());
		System.out.println("面积："+s.getArea());
	}

}
