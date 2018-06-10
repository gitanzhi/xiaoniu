package cn.edu360.javase.oo.dt.shape;

public class Circle extends Shape {
	
	public static final double PI = 3.1415926;
	
	private double r;
	
	public Circle() {
	
	}

	public Circle(double r) {
		super();
		this.r = r;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	@Override
	public double getArea() {
		return PI*r*r;
	}

	@Override
	public double getTotalLength() {
		return 2*PI*r;
	}

}
