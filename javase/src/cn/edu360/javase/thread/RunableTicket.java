package cn.edu360.javase.thread;
/**
 * 同步代码块
 * 	格式：
 * 	synchronized(){
 * 	
 * 	}
 * 	可以是任意的对象，但是必须保证锁对象的唯一性或者说多个线程使用的是同一把锁
 * 
 * 同步方法
 * 	格式：
 * 	修饰符 synchronized 返回值类型 方法名 (参数列表){
 * 		方法体
 * 		ruturn ;
 * 	}
 *  非静态的同步方法的锁对象是this
 *  静态的同步方法的锁对象是当前字节码对象
 *  
 * @author Liu Ming
 * @createdTime 2018年5月1日 下午3:31:38
 */
public class RunableTicket implements Runnable{

	private static int ticket = 100;
	
	@Override
	public synchronized void run() {
		while(true) {
			//synchronized (Object.class) {
				if(ticket>0) {
					System.out.println(Thread.currentThread().getName()+"正在出售第"+ticket+"张票");
					ticket--; 	
				}else{
					break;
				}
			//}
			
			//每次卖票延迟100毫秒
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
