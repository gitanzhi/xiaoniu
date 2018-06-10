package cn.edu360.javase.io;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputStreamDemo {

	public static void main(String[] args) {
		try {
			DataInputStream dis = new DataInputStream(new FileInputStream("D:/java/test.txt"));
			int i = dis.readInt();
			System.out.println(i);
			
			long l = dis.readLong();
			System.out.println(l);
			
			String string = dis.readUTF();
			System.out.println(string);
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
