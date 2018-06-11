package cn.edu360.day09.dao;

import cn.edu360.day09.model.User;

public interface UserDao {
	
	public boolean save(User user);
	
	public User getUserByName(String userName);
	
}
