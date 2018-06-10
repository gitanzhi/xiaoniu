package cn.edu360.javase.oo;

public class CircleDemo {

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.r = 3;
		System.out.println("圆的周长为"+circle.getTotalLength());
		System.out.println("圆的面积为"+circle.getArea());
		
		
		Circle circle2 = new Circle(4);
		System.out.println("圆的周长为"+circle2.getTotalLength());
		System.out.println("圆的面积为"+circle2.getArea());
	}

}
