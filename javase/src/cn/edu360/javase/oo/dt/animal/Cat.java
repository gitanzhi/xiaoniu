package cn.edu360.javase.oo.dt.animal;

public class Cat extends Animal {
	
	private String eyeColor;
	
	public Cat() {
		
	}
	
	public Cat(String eyeColor) {
		super();
		this.eyeColor = eyeColor;
	}
	
	public Cat(String name,String eyeColor) {
		super(name);
		this.eyeColor = eyeColor;
	}
	

	public String getEyeColor() {
		return eyeColor;
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

	@Override
	public void enjoy() {
		System.out.println("我叫"+name+",我的眼睛是"+eyeColor);
	}

}
