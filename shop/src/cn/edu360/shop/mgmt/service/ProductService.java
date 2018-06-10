package cn.edu360.shop.mgmt.service;

import java.util.List;

import cn.edu360.shop.pojo.Product;

public interface ProductService {
	
	/*
	 * 查询商品类别的信息
	 */
	public List<String> getCategories();
	
	/*
	 * 添加商品到商品库
	 */
	public void addItem(String pInfo);

	/*
	 * 查询所有商品
	 */
	public List<Product> getAllProducts();

	/*
	 * 根据商品ID去查询
	 */
	public Product getProductById(String pId);
}
