package cn.edu360.javase.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class InputStreamReaderDemo {

	public static void main(String[] args) {
		try(
				FileInputStream fis = new FileInputStream("D:/java/test.txt");
				InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
				) {
			int length = 0;
			char[] chars = new char[1024];
			while((length=isr.read(chars))!=-1) {
				System.out.print(new String(chars,0,length));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
