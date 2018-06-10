package cn.edu360.javase.oo.elephant;

public class Test {

	public static void main(String[] args) {
		Elephant elephant = new Elephant();
		Fridge fridge = new Fridge();
		
		fridge.openTheDoor();
		elephant.goWhere("冰箱");
		fridge.closeTheDoor();
		
		
	}

} 
