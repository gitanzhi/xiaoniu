package cn.edu360.javase.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) {
		try (
				FileWriter  fw = new FileWriter("D:/java/test.txt");
				BufferedWriter  bw = new BufferedWriter(fw);	
				){
			bw.write("你好，小牛学堂");
			bw.newLine();//换行
			bw.write("小牛学堂你好");
			bw.flush();
			System.out.println("写入成功");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
