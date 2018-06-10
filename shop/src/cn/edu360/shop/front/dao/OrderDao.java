package cn.edu360.shop.front.dao;

import java.util.HashMap;

import cn.edu360.shop.pojo.Order;

public interface OrderDao {

	HashMap<String, Order> loadUserOrderData(String username);
	
	void saveUserOrderData(String username, HashMap<String, Order> orderMap);

}
