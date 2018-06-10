package cn.edu360.javase.thread;

public class ThreadTicket extends Thread{
	private static int ticket = 100;
	
	public ThreadTicket(String string) {
		super(string);
	}

	@Override
	public void run() {
		while(true) {
			synchronized (Object.class) {
				if(ticket>0) {
					System.out.println(getName()+"正在出售第"+ticket+"张票");
					ticket--;
				}else{
					break;
				}
			}
			
			//每次卖票延迟100毫秒
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
