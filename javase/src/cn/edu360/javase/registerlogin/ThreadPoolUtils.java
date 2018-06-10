package cn.edu360.javase.registerlogin;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolUtils {
	private static ExecutorService threadPool = Executors.newCachedThreadPool();
	
	public static void execute(Runnable command) {
		threadPool.execute(command);
	}
}
