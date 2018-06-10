package cn.edu360.javase.io;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * 创建
 * @author Liu Ming
 * @createdTime 2018年4月30日 上午10:21:34
 */
public class FileDemo2 {
	public static void main(String[] args) throws IOException {
		//创建文件
		File file = new File("D:/java/test1.txt");
		System.out.println(file.createNewFile());
		
		//创建单个文件夹
		//file = new File("D:/java/test");
		//System.out.println(file.mkdir());
		
		//创建多层文件夹
		//file  = new File("D:/java/test/a/b/c");
		//System.out.println(file.mkdirs());
		
		//无法删除带内容得文件夹，为空可以删除
		//System.out.println(file.delete());
		
		//给文件重命名(可以剪切)
		//System.out.println(file.renameTo(new File("D:/java/test/test2.txt")));
		
		//是否是文件夹
		System.out.println(file.isDirectory());
		
		//是否是文件
		System.out.println(file.isFile());
		
		//是否存在
		System.out.println(file.exists());
		
		//是否可读
		System.out.println(file.canRead());
		
		//是否可写
		System.out.println(file.canWrite());
		
		//是否隐藏
		System.out.println(file.isHidden());
		
		//获得绝对路径1）
		System.out.println(file.getAbsolutePath());
		// 2）
		file = new File("./src/cn/edu360/javase/io/FileDemo2.java");
		System.out.println(file.getAbsolutePath());
		
		//相对路径
		file = new File("./src/cn/edu360/javase/io/FileDemo2.java");
		System.out.println(file.getPath());
		
		//文件名
		System.out.println(file.getName());
		
		//获取文件大小
		System.out.println(file.length());
		
		//获取日期
		System.out.println(new SimpleDateFormat().format(file.lastModified()));
		
		//获取文件夹下的所有子文件名，是文件名
		file = new File("D:/java");
		String[] lists = file.list();
		for (String string : lists) {
			System.out.println(string);
		}
		
		//获取文件夹下的所有子文件路径，是路径
		File[] files = file.listFiles();
		for (File file2 : files) {
			System.out.println(file2);
		}
			
	}
	
}
