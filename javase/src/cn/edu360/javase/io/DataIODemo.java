package cn.edu360.javase.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class DataIODemo {

	public static void main(String[] args) {
		try (
				DataOutputStream dos = new DataOutputStream(new FileOutputStream("D:/java/user.dat"));
				DataInputStream dis = new DataInputStream(new FileInputStream("D:/java/user.dat"));
				){
			  Person p = new Person("张三",22,'女');
			  Person p1 = new Person("李四",42,'男');
			  
			  
			  dos.writeUTF(p.getName());
			  dos.writeInt(p.getAge());
			  dos.writeChar(p.getSex());
			  
			  dos.writeUTF(p1.getName());
			  dos.writeInt(p1.getAge());
			  dos.writeChar(p1.getSex());
			  
			  String p_name = dis.readUTF();
			  int p_age = dis.readInt();
			  char p_sex = dis.readChar();
			  
			  String p1_name = dis.readUTF();
			  int p1_age = dis.readInt();
			  char p1_sex = dis.readChar();
			  
			  Person p2 = new Person(p_name,p_age,p_sex);
			  Person p3 = new Person(p1_name,p1_age,p1_sex);
			  
			  System.out.println(p2);
			  System.out.println(p3);
			  
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
