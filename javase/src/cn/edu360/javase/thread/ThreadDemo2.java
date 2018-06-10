package cn.edu360.javase.thread;
/**
 * 得到线程名称，设置线程名称
 * @author Liu Ming
 * @createdTime 2018年5月1日 下午2:27:43
 */
public class ThreadDemo2 {

	public static void main(String[] args) {
		 
		Mythread2 mythread2 = new Mythread2();
		mythread2.start();
		
		//String getName() 返回该线程的名称。
		System.out.println(mythread2.getName());//Thread-0
		
		//setName 
		mythread2.setName("子线程1");
		System.out.println(mythread2.getName());//子线程1
		
		//setname2
		//Mythread2 mythread2 = new Mythread2("线程名称");
		
		
		//返回对当前正在执行的线程对象的引用。
		Thread currentThread = Thread.currentThread();
		System.out.println(currentThread.getName());//main
	
		//主线程名称也可以设置
		currentThread.setName("主线程名称");
		System.out.println(currentThread.getName());
	
		
	
	}

}
class Mythread2 extends Thread{
	
	public Mythread2() {
		
	}
	
	public Mythread2(String threadName) {
		super(threadName);
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
	}
}