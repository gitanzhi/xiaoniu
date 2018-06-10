package cn.edu360.shop.mgmt.dao;
import java.util.HashMap;

import cn.edu360.shop.pojo.Product;

/**
 * 数据访问
 * @author Administrator
 *
 */
public interface ProductDao {
	
	public HashMap<String, Product> loadProductData();
	
	public void saveproductData(HashMap<String, Product> productMap);
}
