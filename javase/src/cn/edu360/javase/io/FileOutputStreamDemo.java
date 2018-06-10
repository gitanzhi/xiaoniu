package cn.edu360.javase.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("D:/java/test.txt",true);//写上true,在文件末尾增加内容
			
			String str = "as小牛学堂";
			byte[] b = str.getBytes();
			
			
			fos.write(b);
			
			fos.write(97);
			
			fos.write(b, 0, 4);
			
			fos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(fos!=null) {
					fos.close();
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
