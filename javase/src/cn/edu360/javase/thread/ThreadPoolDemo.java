package cn.edu360.javase.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * public static ExecutorService newCachedThreadPool()
 * 
 * @author Liu Ming
 * @createdTime 2018年5月1日 下午10:49:13
 */
public class ThreadPoolDemo {

	public static void main(String[] args) {
		//newCachedThreadPool()创建一个可根据需要创建新线程的线程池，但是在以前构造的线程可用时将重用它们。对于执行很多短期异步任务的程序而言，这些线程池通常可提高程序性能。
		//线程池里面的空闲线程存活时间是60s
		ExecutorService ThreadPool = Executors.newCachedThreadPool();
		
		//创建一个可重用固定线程数的线程池，以共享的无界队列方式来运行这些线程。
		ThreadPool = Executors.newFixedThreadPool(5);
		
		//创建一个使用单个 worker 线程的 Executor，以无界队列方式来运行该线程。
        ThreadPool = Executors.newSingleThreadExecutor();
		
		ThreadPool.execute(new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName()+"执行了");
			}
		});
		//
		System.out.println(Thread.currentThread().getName()+"执行了");
		
		//关闭线程池
		ThreadPool.shutdown();
		
		ThreadPoolUtils.close();
		
		ThreadPoolUtils.execute(new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName()+"执行了");
			}
		});
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
