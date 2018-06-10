package cn.edu360.shop.front.service;

import java.util.List;

import cn.edu360.shop.pojo.Product;

public interface CartService {

	void addItemToCart(String username, String pId, int number);

	List<Product> getUserCart(String username);

	void updateUserCart(String username, String string, int parseInt);
	
}
