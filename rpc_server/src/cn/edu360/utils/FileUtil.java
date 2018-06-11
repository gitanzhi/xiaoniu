  package cn.edu360.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class FileUtil<T> {
	
	public static final String PATH = "D:/java/rpc.obj";
	
	public  void writeMapToFile(HashMap<String,T> map) throws Exception {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(PATH));
		oos.writeObject(map);
		oos.close();
		
	}
	
	public HashMap<String, T> readMapFromFile() throws Exception{
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(PATH));
		HashMap<String, T> map = (HashMap<String, T>)ois.readObject();
		ois.close();
		return map;
	}
	
	
}
