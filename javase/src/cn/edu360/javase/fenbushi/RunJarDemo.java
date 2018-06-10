package cn.edu360.javase.fenbushi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class RunJarDemo {
	public static void main(String[] args) throws Exception {
		Runtime runtime = Runtime.getRuntime();
		Process process = runtime.exec("java -jar D:/java/wordcount.jar");
		
		InputStream in = process.getInputStream();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(in,"gbk"));
		System.out.println(br.readLine());
		
		
	}
}
