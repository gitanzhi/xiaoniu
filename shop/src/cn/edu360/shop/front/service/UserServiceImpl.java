package cn.edu360.shop.front.service;

import java.util.HashMap;

import cn.edu360.shop.front.dao.UserDao;
import cn.edu360.shop.front.dao.UserDaoImpl;
import cn.edu360.shop.pojo.User;

public class UserServiceImpl implements UserService{

	UserDao userDao = new UserDaoImpl();
	
	@Override
	public boolean isExists(String userName) {
		HashMap<String, User> userMap = userDao.loadUserData();
		
		return userMap.containsKey(userName);
	}

	@Override
	public void register(String userName, String password, String address) {
		// TODO Auto-generated method stub
		User user = new User();
		user.setUserName(userName);
		user.setPassword(password);
		user.setAddress(address);
		//获取dao数据
		HashMap<String, User> userMap = userDao.loadUserData();
		userMap.put(user.getUserName(), user);
		userDao.saveUserData(userMap);
	}

	@Override
	public boolean login(String userName1, String password1) {
		HashMap<String, User> userMap = userDao.loadUserData();
		if(userMap.containsKey(userName1)) {
			User user = userMap.get(userName1);
			return user.getPassword().equals(password1);
		}else {
			return false;
		}
	}

	@Override
	public User getUserById(String username) {
		HashMap<String, User> userMap = userDao.loadUserData();
		User user = userMap.get(username);
		return user;
	}

}
