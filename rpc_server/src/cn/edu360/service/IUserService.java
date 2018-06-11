package cn.edu360.service;

import protocal.Result;
import protocal.User;

public interface IUserService {

	public Result register(User u) throws Exception;

	public Result login(String userName, String password) throws Exception;
}
