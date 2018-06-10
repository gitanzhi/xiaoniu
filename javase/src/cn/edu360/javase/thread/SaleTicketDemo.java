package cn.edu360.javase.thread;
/**
 * 实现火车卖票需求：
 * 	春节某火车站正在卖票，假设还剩下100张票，而他又有3个窗口同时售票，设计一个程序模拟卖票顺序
 * 	在真实生活中，售票时网络是不能实时传输的，总是存在延迟的情况，所以出售每一张票后，需要一点时间延迟
 * 	
 * 两种方法实现
 * 	1.继承Thread类
 * 	2.实现Runable接口
 * 
 * 如何判断一个程序中有线程安全问题 ？
 * 	1.是否是多线程环境
 * 	2.是否有共享数据
 * 	3.是否有多条语句操作共享数据
 * 
 * 如何解决多线程安全问题？
 * 	基本思想：让程序没有安全问题的环境
 * 
 * 如何实现？
 * 	把多个语句操作共享数据的代码给锁起来，让任意时刻只能有一个线程执行即可
 * 
 * 	
 * @author Liu Ming
 * @createdTime 2018年5月1日 下午3:03:05
 */
public class SaleTicketDemo {

	public static void main(String[] args) {
		//第一种方法
		new ThreadTicket("窗口1").start();
		new ThreadTicket("窗口2").start();
		new ThreadTicket("窗口3").start();
		
		//第二种
//		RunableTicket target = new RunableTicket();
//		new Thread(target,"窗口1").start();
//		new Thread(target,"窗口2").start();
//		new Thread(target,"窗口3").start();
		
	}

}
