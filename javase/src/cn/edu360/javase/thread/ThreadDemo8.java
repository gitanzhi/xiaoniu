package cn.edu360.javase.thread;
/**
 * 匿名内部类：继承一个类或者实现了接口的匿名子类对象
 * 
 * new 接口或者类名(){
 * 	实现或者重写的方法
 * }
 * new Thread(){}.start()
 * new Thread(new Runable(){}).start()
 * @author Liu Ming
 * @createdTime 2018年5月1日 下午4:14:29
 */
public class ThreadDemo8 {

	public static void main(String[] args) {
		//匿名内部类实现
		new Thread() {
			@Override
			public void run() {
				System.out.println(getName()+"启动");
			}
			
		}.start();
		
		System.out.println(Thread.currentThread().getName()+"over");
	
		//runable
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName()+"启动");
			}
		}).start();
		System.out.println("over");
	
	
	}

}
