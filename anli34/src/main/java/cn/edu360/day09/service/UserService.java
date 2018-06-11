package cn.edu360.day09.service;

import cn.edu360.day09.model.User;
import cn.edu360.day09.model.UserResult;

public interface UserService {

	public UserResult login(User user);
	
	public UserResult register(User user);
}
