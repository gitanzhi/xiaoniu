package cn.edu360.javase.io;
/**
 * 简化版的字符流
 */
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {

	public static void main(String[] args) {
		try(
				FileReader fr = new FileReader("D:/java/test.txt");
				FileWriter fw = new FileWriter("D:/java/test/test3.txt");
				) {
			int length = 0;
			char[] chars = new char[1024];
			while((length=fr.read(chars))!=-1) {
				fw.write(chars, 0, length);
			}
			System.out.println("完成");
			
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
}
