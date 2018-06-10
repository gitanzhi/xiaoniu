package cn.edu360.javase.oo.iface.print;

/**
 *
 * @author liuming
 * @date 2018年4月15日  下午1:44:11
 */
public class PrintTest {

	public static void main(String[] args) {
		InterfaceA a = new Print();
		InterfaceB b = new Print();
		
		a.printCapitalLetter();
		b.printLowercaselLetter();
	}

}
