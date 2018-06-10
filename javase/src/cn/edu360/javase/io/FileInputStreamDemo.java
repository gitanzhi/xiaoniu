package cn.edu360.javase.io;

import java.io.FileInputStream;

public class FileInputStreamDemo {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("D:/java/test.txt");
		
		//单次读取
		int read = fis.read();
		System.out.println((char)read);
		read = fis.read();
		System.out.println((char)read);
		read = fis.read();
		System.out.println((char)read);
	
		//循环单次读取
//		int read1 = 0;
//		while((read1 = fis.read())!=-1) {
//			System.out.print((char)read1);
//		}
		
		System.out.println();
		//一次读取多个字节
//		byte[] b = new byte[10];
//		int read2 = fis.read(b);
//		System.out.println(read2);//实际读了几个（个数）
//		System.out.println(new String(b));
		
		//循环读取多个
//		byte[] b1 = new byte[5];
//		int read3 = 0;
//		while((read3=fis.read(b1))!=-1) {
//			System.out.print(new String(b1,0,read3));
//		}
		
		fis.close();
	}

}
