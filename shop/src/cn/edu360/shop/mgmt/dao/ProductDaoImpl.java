package cn.edu360.shop.mgmt.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import cn.edu360.shop.pojo.Product;

public class ProductDaoImpl implements ProductDao{

	/**
	 * 从商品数据文件加载为一个hashMap
	 */
	@Override
	public HashMap<String, Product> loadProductData() {
		
		/*
		 * 系统第一次不存在，需要创建空的
		 */
		File file = new File("D:\\java\\shop\\product.data");
		if(!file.exists()) {
			HashMap<String, Product> productMap = new HashMap<String,Product>();
			saveproductData(productMap);
			return productMap;
		}
		
		try {
			FileInputStream fin = new FileInputStream("D:\\java\\shop\\product.data");
			
			ObjectInputStream oin = new ObjectInputStream(fin);
			HashMap<String, Product> productMap = (HashMap<String, Product>) oin.readObject();
			return productMap;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void saveproductData(HashMap<String, Product> productMap) {
		try {
			FileOutputStream fout = new FileOutputStream("D:\\java\\shop\\product.data");
			ObjectOutputStream oout = new ObjectOutputStream(fout);
			//需要实现序列化
			oout.writeObject(productMap);
			fout.close();
			oout.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
