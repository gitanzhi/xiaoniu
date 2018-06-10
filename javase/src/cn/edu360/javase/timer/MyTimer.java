package cn.edu360.javase.timer;

public class MyTimer {
	private boolean flag = true;
	
	public synchronized void schedule(MyTimerTask task ,long delay) {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep(delay);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(flag) {
					task.run();
				} 
			}
		}).start();
	}
	
	public synchronized void schedule(MyTimerTask task , long delay,long period) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(delay);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if(flag) {
					task.run();
				}
				while(flag) {
					try {
						Thread.sleep(period);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if(flag) {
						task.run();
					}
				}
			}
		}).start();
	}
	
	public synchronized void cancel() {
		flag = false;
	}
}
