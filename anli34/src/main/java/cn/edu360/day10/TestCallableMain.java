package cn.edu360.day10;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

public class TestCallableMain {
	public static void main(String[] args) {
		
		String ret1 = "";
		String ret2 = "";
		
		String path1 ="D:\\java\\data\\wc3.jar" ;
		String comd1 ="java -jar "+path1;
		String localPath1="D:\\java\\data\\wc.jar";
		String ip1="localhost";
		CalableClient cc1 = new CalableClient(path1, comd1, localPath1, ip1);
		FutureTask<String> futureTask1 = new FutureTask<>(cc1);
		Thread thread1 = new Thread(futureTask1);
		thread1.start();
		
		try {
			ret1 = futureTask1.get(10, TimeUnit.SECONDS);
			//System.out.println(string1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		String path2 ="D:\\java\\data\\wc4.jar" ;
		String comd2 ="java -jar "+path2;
		String localPath2="D:\\java\\data\\wc.jar";
		String ip2="localhost";
		CalableClient cc2 = new CalableClient(path2, comd2, localPath2, ip2);
		FutureTask<String> futureTask2 = new FutureTask<>(cc2);
		Thread thread2 = new Thread(futureTask2);
		thread2.start();
		
		try {
			ret2 = futureTask2.get(10, TimeUnit.SECONDS);
			//System.out.println(string2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		HashMap<String, Integer> map = new HashMap<>();
		String ret = ret1+ret2;
		String[] split = ret.split("\n");
		for (String string : split) {
			System.out.println(string);
			String[] split2 = string.split("=");
			String word = split2[0];
			int count = Integer.parseInt(split2[1]);
			Integer orDefault = map.getOrDefault(word, 0);
			orDefault+=count;
			map.put(word, orDefault);
		}
		for (Entry<String, Integer> entry: map.entrySet()) {
			System.out.println(entry);
		}
	}
}
