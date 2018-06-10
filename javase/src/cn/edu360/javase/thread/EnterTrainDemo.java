package cn.edu360.javase.thread;
/**
 * 在做火车进站时，在火车没有到站或者时间没有到之前，所有人都是排队状态，工作人员一般会在站内等着 ，到了进站的时候，工作人员会将乘客放行
 * 有的地方是一个人一个人的检票放行，有的地方是一下子会将所有的人都放行然后查票
 * 	对应到Java程序中
 * 		可以将进站设置条件为一个布尔类型的标记isOpen,isOpen初始状态为false，所以刚开始人们都是排队
 * 		工作人员是有钥匙的可以随便改变这个标记随便进出
 * 		每一个线程就是一个乘客
 * 		调用notify时，会随机选取一个等待的乘客放行
 * 		调用notifyAll的时候，会将所有的乘客放行
 * 	wait,notify.notifyAll这些方法必须在同步代码中使用锁对象调用
 *  调用wait方法时，当前锁对象已经被释放了
 *  
 *  为什么notice，noticeAll，wait定义在object中
 *  	因为wait这几个必须通过锁对象调用，锁对象又可以是任意的对象，被任意对象调用的方法是放在object中
 * @author Liu Ming
 * @createdTime 2018年5月1日 下午3:43:49
 */
public class EnterTrainDemo {

	public static void main(String[] args) {
		//先让几个乘客进入等待状态
		new EnterTrain("张三").start();
		new EnterTrain("李四").start();
		new EnterTrain("王五").start();
		new EnterTrain("赵六").start();
		new EnterTrain("小明").start();
		
		//确保都进入等待状态
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//工作人员进站
		EnterTrain t = new EnterTrain("工作人员");
		t.setOpen(true);
		t.start();
	}

}
class EnterTrain extends Thread{
	private static boolean isOpen;

	public static void setOpen(boolean flag) {
		isOpen = flag;
	}
	
	public EnterTrain(String name) {
		super(name);
	}

	@Override
	public void run() {
		synchronized (Object.class) {
			if(isOpen) {
				System.out.println(getName()+"进站了，3秒后乘客放行");
				try {
					sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//Object.class.notify();//随机一个乘客放行
				Object.class.notifyAll();//不分先后的放行
			}else {
				System.out.println(getName()+"进入排队状态");
				try {
					Object.class.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(getName()+"进站了");
			}
		}
		
	}
}

