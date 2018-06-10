package cn.edu360.javase.oo.extend;

public class ExtendsDemo3 {

	public static void main(String[] args) {

	}

}

class Father{
	String name;
	
	public Father(String name) {
		this.name = name;
	}
}

class Son extends Father{
	String name = "son";
	
	public Son() {
		this("");
	}
	
	public Son(String name) {
		super(name);
		this.name = name;
	}
}