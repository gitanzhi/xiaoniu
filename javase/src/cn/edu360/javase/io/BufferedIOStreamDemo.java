package cn.edu360.javase.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 将jpg移动到新的地方
 * @author Liu Ming
 * @createdTime 2018年4月30日 上午11:59:39
 */
public class BufferedIOStreamDemo {

	public static void main(String[] args)  {
		try(
				//不能写别的，可以自动关闭流
				FileInputStream fis = new FileInputStream("D:/java/tsg.jpg");
				FileOutputStream fos = new FileOutputStream("D:/java/test/gjtsg.jpg");
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				) {
			int length = 0;
			byte[] b = new byte[1024];
			while((length=bis.read(b))!=-1) {
				bos.write(b,0,length);
			}
			
			bos.flush();//2种情况会自动调用，缓存区满了调用或者关流的时候会调用
			System.out.println("成功");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
