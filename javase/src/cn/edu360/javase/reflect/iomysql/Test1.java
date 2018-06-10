package cn.edu360.javase.reflect.iomysql;

import java.io.FileInputStream;
import java.util.Properties;

public class Test1 {
	public static void main(String[] args) throws Exception, IllegalAccessException, ClassNotFoundException {
		ReadFile readFile = new ReadFile();
		readFile.read();
		
		ReadMysql readMysql = new ReadMysql();
		readMysql.read();
		
		//Read r = new ReadFile();
		//Read r = new ReadMysql();
		//r.read();
		
		Properties p = new Properties();
		//p.load(new FileInputStream("src/javase.properties"));
		p.load(Test1.class.getClassLoader().getResourceAsStream("javase.properties"));
		String className = p.getProperty("className");
		Read r = (Read)Class.forName(className).newInstance();
		r.read();
	}
}
