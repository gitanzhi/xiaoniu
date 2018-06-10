package cn.edu360.javase.oo.extend;
/**
 * 修饰类，类不能被继承
 * 修饰变量 ，变量变成了常量
 * 修饰方法 ，方法不能被重写
 * @author Liu Ming
 * @createdTime 2018年4月14日 下午7:21:33
 */
public class FinalDemo {

	final static int a = 100; //一般final和static一起用
	
	final Person p = new Person();
	

}
