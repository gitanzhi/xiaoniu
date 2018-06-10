package cn.edu360.javase;
/**
 * 数据运算
 * 1、从左往右算
 * 2、任何基本数据类型和字符串运算都是字符串
 * 3、byte,char,short 不能直接运算，先转化int
 * @author Liu Ming
 * @createdTime 2018年4月9日 下午9:23:57
 */
public class DataTypeDemo2 {

	public static void main(String[] args) {
		System.out.println('a');//a
		System.out.println('a'+1);//98 ASCII表
		System.out.println("Hello"+'a'+1);//Helloa1
		System.out.println('a'+1+"Hello");//98Hello
		System.out.println("5+5="+5+5);//5+5=55
		System.out.println(5+5+"=5+5");//10=5+5
	}

}
