package cn.edu360.dao;

import protocal.User;

public interface IUserDao {
	
	public boolean save(User u) throws Exception;
	
	public User getUserByUserName(String userName) throws Exception;
	
}
