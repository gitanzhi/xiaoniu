package cn.edu360.javase.thread;
/**
 * 线程阻塞
 * @author Liu Ming
 * @createdTime 2018年5月1日 下午2:27:27
 */
public class ThreadDemo3 {

	public static void main(String[] args) throws Exception {
		Mythread3 mythread3 = new Mythread3();
		mythread3.start();
		
		//在指定的毫秒数内让当前正在执行的线程休眠（暂停执行），此操作受到系统计时器和调度程序精度和准确性的影响
		//mythread3.sleep(1000);等同于Thread.sleep(1000)
		
		//   等待该线程终止。
		mythread3.join();//主线程会等到子线程终止后在执行
		
		//yield() 暂停当前正在执行的线程对象，并执行其他线程
		Thread.yield();
		
		System.out.println("over");
		
	}

}

class Mythread3 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
}