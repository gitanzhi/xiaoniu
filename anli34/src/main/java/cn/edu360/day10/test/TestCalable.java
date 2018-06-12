package cn.edu360.day10.test;

import java.util.Random;
import java.util.concurrent.Callable;
/***
 * 集成Thread
 * 实现Runable接口
 * callable 接口带有返回值的线程
 * @author Administrator
 *
 */
public class TestCalable implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		Random random = new Random();
		int sum = 0;
		for (int i = 0; i < 100; i++) {
			int r = random.nextInt(10);
			System.out.println(r);
			sum+=r;
		}
		
		return sum;
	}
	
}
