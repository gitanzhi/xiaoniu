package cn.edu360.shop.front.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import cn.edu360.shop.front.dao.CartDao;
import cn.edu360.shop.front.dao.CartDaoImpl;
import cn.edu360.shop.mgmt.service.ProductService;
import cn.edu360.shop.mgmt.service.ProductServiceImpl;
import cn.edu360.shop.pojo.Product;

public class CartServiceImpl implements CartService{

	CartDao cartDao= new CartDaoImpl();
	ProductService productService = new ProductServiceImpl();
	@Override
	public void addItemToCart(String username, String pId, int number) {
		HashMap<String, Integer> cartMap = cartDao.loadUserCartData(username);
		cartMap.put(pId, number);
		cartDao.saveUserCartData(username,cartMap);
	}
	
	@Override
	public List<Product> getUserCart(String username) {
		HashMap<String, Integer> cartMap = cartDao.loadUserCartData(username);
		Set<Entry<String, Integer>> entrySet = cartMap.entrySet();
		ArrayList<Product> cartList = new ArrayList<>();
		
		for (Entry<String, Integer> entry : entrySet) {
			Product p = productService.getProductById(entry.getKey());
			p.setStock(entry.getValue());
			cartList.add(p);
		}
		
		return cartList;
	}

	@Override
	public void updateUserCart(String username, String pid, int number) {
		//先加载
		HashMap<String, Integer> cartMap = cartDao.loadUserCartData(username);
		if(number==-1) {
			cartMap.remove(pid);
		}else {
			cartMap.put(pid, number);
		}
		
		cartDao.saveUserCartData(username, cartMap);
	}

}
