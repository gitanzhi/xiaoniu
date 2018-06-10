package cn.edu360.javase.thread;
/**
 * join interrupt
 * @author Liu Ming
 * @createdTime 2018年5月1日 下午2:50:00
 */
public class ThreadDemo6 {

	public static void main(String[] args) {
		Mythread6 mythread6 = new Mythread6(Thread.currentThread());
		mythread6.start();
		
		//等到子线程终止后执行
		try {
			mythread6.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("over");
	}

}

class Mythread6 extends Thread{
	private Thread mainThread;
	 
	public Mythread6(Thread mainThread) {
		this.mainThread = mainThread;
	}

	@Override
	public void run() {
		//确保主线程时间阻塞的状态
		try {
			sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		mainThread.interrupt();
		try {
			sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}	
	}
}