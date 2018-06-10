package cn.edu360.javase.fenbushi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolUtils {
	private static ExecutorService threadPool = Executors.newCachedThreadPool();
	public static void execute(Runnable command) {
		//使用线程池之前需要判断线程池是否关闭了
		if(!threadPool.isShutdown()) {
			threadPool.execute(command);
		}else {
			System.out.println("线程池关闭了，新建一个");
			threadPool =  Executors.newCachedThreadPool();
			execute(command);
		}
	}
	
	public static void close() {
		threadPool.shutdown();
	}
}
