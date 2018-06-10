package cn.edu360.javase.oo.dt.shape;
/**
 * 1.构建抽象类，包含抽象方法，求周长，面积
 * 2.构建类长方形和圆形
 * 3.构建测试类，计算周长面积
 * @author Liu Ming
 * @createdTime 2018年4月14日 下午8:21:37
 */
public abstract class Shape {
	
	public abstract double getArea();
	
	public abstract double getTotalLength();
}
