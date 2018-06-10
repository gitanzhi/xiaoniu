package cn.edu360.javase.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 虽然我们可以理解同步代码块和同步方法的锁对象问题，但是不能清晰看到在哪里上了锁，哪里释放了，为了清晰表达如何加锁和释放锁，提供了lock的接口
 * Lock是一个接口
 *  void lock()
 *  void unlock()
 * ReentrantLock Lock的子类
 *  
 * @author Liu Ming
 * @createdTime 2018年5月1日 下午10:33:34
 */
public class LockDemo {

	public static void main(String[] args) {
		TicketTask task = new TicketTask();
		new Thread(task,"窗口1").start();
		new Thread(task,"窗口2").start();
		new Thread(task,"窗口3").start();
	}

}
class TicketTask implements Runnable {
	private  int ticket = 10;
	
	Lock lock = new ReentrantLock();
	
	public void run() {
		while(true) {
			lock.lock();
			if(ticket>0) {
				System.out.println(Thread.currentThread().getName()+"正在出售第"+ticket+"张票");
				ticket--;
			}else {
				break;
			}
			lock.unlock();
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}