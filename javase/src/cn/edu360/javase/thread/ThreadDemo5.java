package cn.edu360.javase.thread;
/**
 * sleep  interrupt
 * @author Liu Ming
 * @createdTime 2018年5月1日 下午2:26:49
 */
public class ThreadDemo5 {

	public static void main(String[] args) {
		Mythread5 mythread5 = new Mythread5();
		mythread5.start();
		
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//首先确保子线程进入到阻塞
		mythread5.interrupt();
		
		System.out.println("over");
	}

}

class Mythread5 extends Thread{
	@Override
	public void run() {
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