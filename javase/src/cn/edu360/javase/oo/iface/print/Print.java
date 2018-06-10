package cn.edu360.javase.oo.iface.print;

public class Print implements InterfaceA, InterfaceB {

	@Override
	public void printLowercaselLetter() {
		for(char i = 'a';i<= 'z';i++) {
			System.out.print(i+",");
		}
		System.out.println();
	}

	@Override
	public void printCapitalLetter() {
		for(char i='A';i<='Z';i++) {
			System.out.print(i+",");
		}
		System.out.println();
	}

}
