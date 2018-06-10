package cn.edu360.shop.front.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import cn.edu360.shop.pojo.Order;

public class OrderDaoImpl implements OrderDao {

	@Override
	public HashMap<String, Order> loadUserOrderData(String username) {
		File file = new File("D:\\java\\shop\\"+username+"_orders.data");
		if(!file.exists()) {
			HashMap<String, Order> orderMap = new HashMap<>();
			try {
				FileOutputStream fos = new FileOutputStream(file);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(orderMap);
				fos.close();
				oos.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			HashMap<String, Order> orderMap = (HashMap<String, Order>)ois.readObject();
			fis.close();
			ois.close();
			return orderMap;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void saveUserOrderData(String username, HashMap<String, Order> orderMap) {
		File file = new File("D:\\java\\shop\\"+username+"_orders.data");	
		try {
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(orderMap);
			fos.close();
			oos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	

	

}
