package cn.edu360.javase.oo.dt.animal;

public class Dog extends Animal {
	
	private String furColor;
	

	public Dog() {
		
	}
	
	public Dog(String furColor) {
		super();
		this.furColor = furColor;
	}
	
	public String getFurColor() {
		return furColor;
	}

	public void setFurColor(String furColor) {
		this.furColor = furColor;
	}

	@Override
	public void enjoy() {
		System.out.println("我叫"+name+",我的毛发是"+furColor);
	}

}
