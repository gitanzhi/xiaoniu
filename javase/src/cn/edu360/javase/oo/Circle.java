package cn.edu360.javase.oo;
/*
 * 求圆的周长和面积
 */
public class Circle {
	
	final double PI = 3.14;//final 用于定义常量，用final修饰的量值不能变
	
	double r ;//半径
	
	public Circle() {
		
	}
	
	public Circle(double r) {
		this.r = r;
	}
	
	
	/*
	 * 求周长
	 */
	
	public double getTotalLength() {
		return 2*PI*r;
	}
	
	/*
	 * 求面积
	 */
	
	public double getArea() {
		return PI*r*r;
	}
	
}
