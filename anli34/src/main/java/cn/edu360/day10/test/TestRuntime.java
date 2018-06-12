package cn.edu360.day10.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/***
 * 执行jar文件
 * @author Administrator
 *
 */
public class TestRuntime {
	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		String command = "java -jar D:\\java\\data\\wc.jar";
		try {
			Process exec = runtime.exec(command);
			
			BufferedReader br = new BufferedReader(new InputStreamReader(exec.getInputStream()));
			String line = null;
			while((line=br.readLine())!=null){
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
