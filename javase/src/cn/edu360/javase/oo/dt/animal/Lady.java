package cn.edu360.javase.oo.dt.animal;

public class Lady {
	
	private String name;
	
	private Animal pet;

	public Lady(String name, Animal pet) {
		super();
		this.name = name;
		this.pet = pet;
	}
	
	public Lady() {
		
	}
	
	public void myPetEnjoy() {
		pet.enjoy();
		System.out.println("我是"+name+"，我的宠物很开心，所以我高兴");
	}

}
