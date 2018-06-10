package cn.edu360.javase.oo;
/**
 * 创建一个长方形的类，定义成员方法和成员变量 ，测试类中求周长和面积
 * @author Liu Ming
 * @createdTime 2018年4月14日 下午3:09:24
 */
public class Rectangle {
  
	double length;//长度
  
	double width;//宽度
	
	/*
	 * 延伸：学习参数构造方法后的课程延伸
	 */
	public Rectangle(double length,double width) {
		this.length = length;
		this.width = width;
	}
	
	public Rectangle() {
		
	}
  
	/*
	 * 求周长
	 */
	public double getTotalLength() {
		return (length+width)*2;
	}
	
	/*
	 * 求面积
	 */
	public double getArea() {
		return length*width;
	}
}
