package cn.edu360.javase.oo;
/**
 * 定义一个美女的类
 * 封装
 * @author Liu Ming
 * @createdTime 2018年4月14日 下午4:25:54
 */
public class BeautifulGirl {
	
	private char sex = '女';
	
	private double height;
	
	private double width;
	
	private boolean isLongHair;
	
	public void setSex(char sex) {
		if(sex=='女'||sex=='男') {
			this.sex = sex;
		}
	}
	
	public char getSex()
	{
		return sex;
	}
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public boolean isLongHair() {
		return isLongHair;
	}

	public void setLongHair(boolean isLongHair) {
		this.isLongHair = isLongHair;
	}

	public void ask() {
		System.out.println("我美吗");
	}
	
}
