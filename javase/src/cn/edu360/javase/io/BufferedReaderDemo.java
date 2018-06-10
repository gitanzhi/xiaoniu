package cn.edu360.javase.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BufferedReaderDemo {

	public static void main(String[] args) {
		try (
				FileReader fr = new FileReader("D:/java/test.txt");
				BufferedReader br = new BufferedReader(fr);
				){
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
			
			String line;
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
