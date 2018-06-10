package cn.edu360.javase.thread;
/**
 * 声明实现 Runnable 接口的类。该类然后实现 run 方法。
 * 然后可以分配该类的实例，在创建 Thread 时作为一个参数来传递并启动。
 * 
 * @author Liu Ming
 * @createdTime 2018年5月1日 下午2:56:15
 */
public class ThreadDemo7 {

	public static void main(String[] args) {
		MyRunable myRunable = new MyRunable();
		Thread thread = new Thread(myRunable,"子线程");
		thread.start();
		
		System.out.println("over");
	}

}
class MyRunable implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+"-"+i);
		}
	}
	
}
