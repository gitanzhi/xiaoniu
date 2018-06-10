package cn.edu360.javase.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectOutputStreamCollectionDemo {

	public static void main(String[] args) {
		try (
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:/java/person.obj"));
				){
			ArrayList<Person> list = new ArrayList<Person>();
			Person p1 = new Person("唐僧",33,'男');
			Person p2 = new Person("孙悟空",700,'雄');
			Person p3 = new Person("白骨精",100,'女');
			list.add(p1);
			list.add(p2);
			list.add(p3);
			
			oos.writeObject(list);
			System.out.println("写入成功");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	

}
