package cn.edu360.javase.io;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class OutputStreamWriterDemo {

	public static void main(String[] args) {
		System.out.println(Charset.defaultCharset());
		
		
		try(
				FileOutputStream fos = new FileOutputStream("D:/java/test.txt");
				OutputStreamWriter osw = new OutputStreamWriter(fos);
				) {
			osw.write("小牛学堂");
			System.out.println("成功");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
