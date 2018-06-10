package cn.edu360.javase.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo {

	public static void main(String[] args) {
		try (
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:/java/person.obj"));
				){
			Person p = new Person("张三",22,'女');
			oos.writeObject(p);
			System.out.println("写入成功");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
