package cn.edu360.javase.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo {
	public static void main(String[] args) {
		try (
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:/java/person.obj"));
				){
			 Object obj = ois.readObject();
			 System.out.println((Person)obj);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
