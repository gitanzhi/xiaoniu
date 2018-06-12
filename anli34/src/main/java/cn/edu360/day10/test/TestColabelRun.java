package cn.edu360.day10.test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class TestColabelRun {
	public static void main(String[] args) throws Exception, ExecutionException {
		
		TestCalable c = new TestCalable();
		//放入futureTask
		FutureTask<Integer> futureTask = new FutureTask<>(c);
		//放入到Thread里边
		Thread thread = new Thread(futureTask);
		thread.start();
		
		Integer integer = futureTask.get();
		System.out.println(integer);
	}
	
}
