package cn.edu360.javase.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ObjectInputStreamCollectionDemo {

	public static void main(String[] args) {
		try (
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:/java/person.obj"));
					){
				Object obj = ois.readObject();
				ArrayList<Person> list = (ArrayList<Person>) obj;
				
				System.out.println(list);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	
	
	
	
	
	
	
}
