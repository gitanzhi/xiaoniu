package cn.edu360.javase.oo;

public class Mobile {
	private String brand;//品牌
	
	private String type;//型号
	
	private String color;//颜色
	
	private double price;//价格，不建议1个小写加大写 如oPrice

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
