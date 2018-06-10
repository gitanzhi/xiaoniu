package cn.edu360.shop.front.service;

import cn.edu360.shop.pojo.User;

public interface UserService {

	/*
	 * 判断是否存在该用户
	 */
	boolean isExists(String userName);

	/*
	 * 注册一个用户
	 */
	public void register(String userName, String password,String address);

	boolean login(String userName1, String password1);

	User getUserById(String username);
	
}
