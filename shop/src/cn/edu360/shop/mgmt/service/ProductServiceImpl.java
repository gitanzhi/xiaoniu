package cn.edu360.shop.mgmt.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import cn.edu360.shop.mgmt.dao.ProductDao;
import cn.edu360.shop.mgmt.dao.ProductDaoImpl;
import cn.edu360.shop.pojo.Product;

public class ProductServiceImpl implements ProductService {
	
	ProductDao productDao = new ProductDaoImpl();

	/*
	 * 查询商品类别的信息
	 */
	@Override
	public List<String> getCategories() {
		
		ArrayList<String> categories = new ArrayList<>();
		categories.add("水果");
		categories.add("蔬菜");
		categories.add("海鲜");
		return categories;
		
	}
	
	/*
	 * 添加商品
	 */
	@Override
	public void addItem(String pInfo) {
		//解析交互层传入的商品数据，商品名称，商品价格，商品类别，商品数量
		String[] fields = pInfo.split(",");
		Product product = new Product();
		//System.out.println("解析后："+fields);
		//使用时间戳作为PId
		long timeStamp = System.currentTimeMillis();
		product.setpId(timeStamp+"");
		product.setpName(fields[0]);
		product.setPrice(Double.parseDouble(fields[1]));
		product.setCategories(fields[2]);
		product.setStock(Integer.parseInt(fields[3]));
		product.setOnShelf(true);
		//System.out.println("传入product:"+product);
		//加载商品数据，作为一个HashMap对象
		HashMap<String, Product> productMap = productDao.loadProductData();
		//System.out.println("加载原有数据："+productMap);
		//放入对象
		productMap.put(product.getpId(), product);	
		productDao.saveproductData(productMap);
		System.out.println("添加商品成功");
	}

	/*
	 * 查询所有商品
	 */
	@Override
	public List<Product> getAllProducts() {
		//加载商品的hashMap
		HashMap<String, Product> productMap = productDao.loadProductData();
		Collection<Product> products = productMap.values();
		ArrayList<Product> pList = new ArrayList<Product>(products);
		return pList;
	}

	@Override
	public Product getProductById(String pId) {
		HashMap<String, Product> productMap = productDao.loadProductData();
		
		return productMap.get(pId);
	}

}
