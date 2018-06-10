package cn.edu360.javase.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.Set;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class PropertiesDemo {

	public static void main(String[] args) {
		 
		 try {
			 Properties p = new Properties();
			 InputStream  reader = PropertiesDemo.class.getClassLoader().getResourceAsStream("javase.properties");
			 p.load(reader);
			 
			 //读取属性
			 String format = p.getProperty("vipLevel");
			 System.out.println(format);
			 
			 //设置属性
			 System.out.println(p.setProperty("vipLevel", "5"));
			 
			 String dateFormat = p.getProperty("date.format");
			 System.out.println(new SimpleDateFormat(dateFormat).format(new Date()));
			 
			 //读取键的名字
			 Set<String> set = p.stringPropertyNames();
			 for (String string : set) {
				System.out.println("str:"+p.getProperty(string,"4"));
			 }
			 System.out.println(set);
			 
			 //存储
			 FileWriter fw = new FileWriter("D:/java/test3.txt");
			 p.store(fw, null);
			 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
	}

	
	
	
	
	
	
	
	
	
	
	
}
