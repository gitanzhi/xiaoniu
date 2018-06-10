package cn.edu360.javase.oo;
/**
 * 学生类
 * @author Liu Ming
 * @createdTime 2018年4月11日 下午4:18:36
 */
public class Student {
	
	String name;
	
	String stuId;
	
	char sex = '男';
	
	public void learn() {
		System.out.println("正在学习");
	}
	
	public void eat() {
		System.out.println("正在吃饭");
	}
	
	public void sleep() {
		System.out.println("正在睡觉");
	}
}
