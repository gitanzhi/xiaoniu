package cn.edu360.shop.front.dao;

import java.util.HashMap;

public interface CartDao {

	HashMap<String, Integer> loadUserCartData(String username);

	void saveUserCartData(String username ,HashMap<String, Integer> cartMap);

}
