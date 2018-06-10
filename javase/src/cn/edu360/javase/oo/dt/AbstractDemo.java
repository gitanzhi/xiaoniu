package cn.edu360.javase.oo.dt;
/**
 * 1.抽象类可以没有抽象方法，有抽象方法一定是抽象类
 * 2.抽象类不可以创建对象，使用向上转型
 * 3.抽象类的子类，要么实现所有的抽象方法，要么自己是抽象类
 * 4.抽象类中有构造方法，子类在创建对象的时候需要调用父类的构造方法
 * 5.抽象类不可以使用final修饰，但是final可以修饰抽象类的非抽象方法，也就是abstract和final不能共存
 * 6.static 不可以修饰外部类，可以修饰内部类
 * 7.static 不可以修饰抽象方法
 * @author Liu Ming
 * @createdTime 2018年4月14日 下午8:04:07
 */
public abstract class AbstractDemo {

	public void eat() {
		
	}
	
	public AbstractDemo() {
		
	}
	
	public abstract void sleep();
	
	public static void main(String[] args) {
		AbstractDemo demo = new AbstractSon();
		demo.sleep();
	}

}

class AbstractSon extends AbstractDemo{
	
	public void	sleep() {
		System.out.println("正在睡觉");
	}
}
