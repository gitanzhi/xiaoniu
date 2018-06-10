package cn.edu360.javase.lock;

public class DiedLock {

	public static void main(String[] args) {
		new Mythread(true).start();
		new Mythread(false).start();
	}

}
class MyLock{
	public static Object lockA = new Object();
	public static Object lockB = new Object();
}

class Mythread extends Thread{
	private  boolean flag;
	
	public Mythread(boolean flag) {
		this.flag = flag;
	}
	
	public void run() {
		if(flag) {
			synchronized (MyLock.lockA) {
				System.out.println("lockA");
				synchronized (MyLock.lockB) {
					System.out.println("lockB");
				}
			}
		}else {
			synchronized (MyLock.lockB) {
				System.out.println("lockB");
				synchronized (MyLock.lockA) {
					System.out.println("lockA");
				}
			}
		}
	}
}