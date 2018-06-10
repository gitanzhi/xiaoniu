package cn.edu360.javase.thread;
/**
 * 一个程序中有一个执行路径就是单线程程序
 * 线程 是程序中的执行线程。Java 虚拟机允许应用程序并发地运行多个执行线程。
 * 为什么重写run：
 *   	子线程启动之后，会默认的调用run方法，所以需要子线程做的事情需要放在run方法中
 * 启动线程的方法： start，并且不能多次启动
 * run方法：子线程要做的事情放在run中
 * start方法 ：启动子线程的方法，调用start方法之后，系统会自动的再分配一个子线程出来
 * @author Liu Ming
 * @createdTime 2018年4月30日 下午3:48:28
 */
public class ThreadDemo {

	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.start();//相当于启用了一个子线程，然后子线程调用实例的run方法，run方法运行在子线程中
		//thread.run();//只是使用了对象调用成员方法
		System.out.println("over");
	}

}

//第一种方法是将类声明为 Thread 的子类。该子类应重写 Thread 类的 run 方法
class MyThread extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
}
