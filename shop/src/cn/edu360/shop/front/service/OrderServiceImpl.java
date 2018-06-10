package cn.edu360.shop.front.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;

import cn.edu360.shop.front.dao.CartDao;
import cn.edu360.shop.front.dao.CartDaoImpl;
import cn.edu360.shop.front.dao.OrderDao;
import cn.edu360.shop.front.dao.OrderDaoImpl;
import cn.edu360.shop.mgmt.service.ProductService;
import cn.edu360.shop.mgmt.service.ProductServiceImpl;
import cn.edu360.shop.pojo.Order;
import cn.edu360.shop.pojo.Product;
import cn.edu360.shop.pojo.User;

public class OrderServiceImpl implements OrderService {

	CartDao cartDao = new CartDaoImpl();
	ProductService productService = new ProductServiceImpl();
	UserService userService = new UserServiceImpl();
	OrderDao orderDao = new OrderDaoImpl();
	
	@Override
	public void submitOrder(String username) {
		//1.加载用户车数据
		HashMap<String, Integer> cartMap = cartDao.loadUserCartData(username);
		//2.计算订单总金额
		Set<Entry<String, Integer>> entrySet = cartMap.entrySet();
		double amount = 0;
		for (Entry<String, Integer> entry : entrySet) {
			Product p = productService.getProductById(entry.getKey());
			amount+=entry.getValue()*p.getPrice();
		}
		//3.获取用户收货地址
		User user = userService.getUserById(username);
		String addr = user.getAddress();
		//4.生成id订单
		UUID randomUUID = UUID.randomUUID();
		String orderId = username+"-"+randomUUID;
		//5.获取订单生成时间
		Date date = new Date();
		
		
		
		//6.构造一个订单对象
		Order order = new Order();
		order.setOrderId(orderId);
		order.setUsername(username);
		order.setAmount(amount);
		order.setAddr(addr);
		order.setDate(date);
		
		
		//7.存储订单数据hashMap
		HashMap<String, Order> orderMap = orderDao.loadUserOrderData(username);
		orderMap.put(order.getOrderId(), order);
		orderDao.saveUserOrderData(username,orderMap);
	}

	@Override
	public List<Order> showOrders(String username) {
		HashMap<String, Order> orderMap = orderDao.loadUserOrderData(username);
		ArrayList<Order> orderList = new ArrayList<>(orderMap.values());
		return orderList;
	}

}
