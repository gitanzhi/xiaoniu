package cn.edu360.day09.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

import cn.edu360.day09.model.User;

/***
 * map<UserName,User>
 * @author Administrator
 *
 */
public class FileUtils {
	/**
	 * 将map存进文件
	 * @param map
	 */
	public static void saveMapToFile(Map<String, User> map){
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(Const.FILE_PATH));) {
			oos.writeObject(map);
			oos.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 返回所有的user
	 * @return
	 */
	public static Map<String, User>  getUserMapByFile(){
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(Const.FILE_PATH));) {
			Map<String, User> map = (Map<String, User>)ois.readObject();
			return map;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
