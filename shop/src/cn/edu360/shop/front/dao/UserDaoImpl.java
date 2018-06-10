package cn.edu360.shop.front.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import cn.edu360.shop.pojo.User;

public class UserDaoImpl implements UserDao {

	@Override
	public HashMap<String, User> loadUserData() {
		File file = new File("D:\\java\\shop\\user.data");
		if(!file.exists()) {
			HashMap<String, User> userMap = new HashMap<>();
			try {
				FileOutputStream fos = new FileOutputStream("D:\\java\\shop\\user.data");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(userMap);
				return userMap;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			FileInputStream fis = new FileInputStream("D:\\java\\shop\\user.data");
			ObjectInputStream ois = new ObjectInputStream(fis);
			HashMap<String, User> userMap = (HashMap<String, User>)ois.readObject();
			fis.close();
			ois.close();
			return userMap;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public void saveUserData(HashMap<String, User> userMap) {
		
		try {
			FileOutputStream fos = new FileOutputStream("D:\\java\\shop\\user.data");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(userMap);
			fos.close();
			oos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
