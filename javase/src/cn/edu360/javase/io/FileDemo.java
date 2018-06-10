package cn.edu360.javase.io;

import java.io.File;

/**
 * File java中文件和文件夹的抽象表示形式
 * @author Liu Ming
 * @createdTime 2018年4月30日 上午10:13:21
 */
public class FileDemo {

	public static void main(String[] args) {
		//直接传路径
		String path = "D:\\java\\workspace\\javase\\src\\cn\\edu360\\javase\\io\\FileDemo.java";
		File file = new File(path);
		
		//传文件夹和路径
		String parent = "D:/java/workspace/javase/src/cn/edu360";
		String child = "/javase/io/FileDemo.java";
		File file2 = new File(parent,child);
		
		//传file和路径
		File parentFile = new File(parent);
		File file3 = new File(parentFile,child);
		
		//
		File file4 = new File("asdasdasd");
		
				
	}

}
