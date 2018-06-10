package cn.edu360.javase.timer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 定时器
 * @author Liu Ming
 * @createdTime 2018年5月1日 下午4:30:26
 */
public class TimerDemo {

	public static void main(String[] args) {
		method2();
	}

	private static void method2() {
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				System.out.println(sdf.format(new Date()));
			}
		};
		timer.schedule(task, 0, 1000);
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		timer.cancel();
	}

	public static void method1() {
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				System.out.println("我是延迟2秒输出的");
			}
		};
		
		//指定时间后执行已安排的任务,一次任务执行一次
		timer.schedule(task, 2000);
		//timer.schedule(task, 2000);//Task already scheduled
		
		//终止定时器
		//timer.cancel();
		
		//重新赋值
		task = new TimerTask() {
			@Override
			public void run() {
				System.out.println("我是重新赋值输出的");
			}
		};
		timer.schedule(task, 2000);
	}

}
