package cn.edu360.shop.front.dao;

import java.util.HashMap;

import cn.edu360.shop.pojo.User;

public interface UserDao {

	public HashMap<String, User> loadUserData();

	public void saveUserData(HashMap<String, User> userMap);
	
}
