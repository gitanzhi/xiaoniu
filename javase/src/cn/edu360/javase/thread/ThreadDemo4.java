package cn.edu360.javase.thread;
/**
 * stop终止线程
 * @author Liu Ming
 * @createdTime 2018年5月1日 下午2:27:10
 */
public class ThreadDemo4 {

	public static void main(String[] args) {
		Mythread4 mythread4 = new Mythread4();
		mythread4.start();
		
		//终止线程 已过时。
		//mythread4.stop();
		
		//
		mythread4.setStop(true);
		
	}

}

class Mythread4 extends Thread{
	//如果stop是true 表示停止
	private boolean isStop = false;
	
	public boolean isStop() {
		return isStop;
	}
	public void setStop(boolean isStop) {
		this.isStop = isStop;
	}
	@Override
	public void run() {
		if(!isStop) {
			for (int i = 0; i < 10; i++) {
				if(isStop) {
					return;
				}
				System.out.println(i);
			}
		}
		
	}
}