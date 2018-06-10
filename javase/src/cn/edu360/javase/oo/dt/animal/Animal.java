package cn.edu360.javase.oo.dt.animal;

public abstract class Animal {
	
	String name;
	
	public Animal() {
		
	}
	
	public Animal(String name) {
		this.name = name;
	}
	
	public abstract void enjoy();
}
