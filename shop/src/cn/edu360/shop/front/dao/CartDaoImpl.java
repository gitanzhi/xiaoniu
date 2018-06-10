package cn.edu360.shop.front.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class CartDaoImpl implements CartDao {

	@Override
	public HashMap<String, Integer> loadUserCartData(String username) {
		File file = new File("D:\\java\\shop\\"+username+"_cart.data");
		if(!file.exists()) {
			HashMap<String, Integer> cartMap = new HashMap<>();
			try {
				FileOutputStream fos = new FileOutputStream(file);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(cartMap);
				oos.close();
				fos.close();
				return cartMap;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		 
		try {
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			HashMap<String, Integer> cartMap = (HashMap<String, Integer>) ois.readObject();
			fis.close();
			ois.close();
			return cartMap;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public void saveUserCartData(String username ,HashMap<String, Integer> cartMap) {
		
		try {
			FileOutputStream fos = new FileOutputStream("D:\\java\\shop\\"+username+"_cart.data");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(cartMap);
			fos.close();
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
