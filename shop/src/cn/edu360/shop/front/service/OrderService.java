package cn.edu360.shop.front.service;

import java.util.List;

import cn.edu360.shop.pojo.Order;

/**
 * 订单管理
 * @author Administrator
 *
 */
public interface OrderService {

	void submitOrder(String username);

	List<Order> showOrders(String username);
	
}
