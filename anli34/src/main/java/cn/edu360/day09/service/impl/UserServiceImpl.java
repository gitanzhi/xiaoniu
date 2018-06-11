package cn.edu360.day09.service.impl;

import cn.edu360.day09.dao.UserDao;
import cn.edu360.day09.dao.impl.UserDaoImpl;
import cn.edu360.day09.model.User;
import cn.edu360.day09.model.UserResult;
import cn.edu360.day09.service.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public UserResult login(User user) {
		UserDao userDao = new UserDaoImpl();
		User userByName = userDao.getUserByName(user.getUserName());
		UserResult userResult = new UserResult();
		if(userByName==null){//没有找到该用户
			userResult.setResult(false);
			userResult.setMessage("没有找到该用户");
		}else{
			String passWord = user.getPassWord();
			if(passWord.equals(userByName.getPassWord())){
				userResult.setResult(true);
				userResult.setMessage("登录成功");
			}else{
				userResult.setResult(false);
				userResult.setMessage("账户密码错误");
			}
		}
		
		return userResult;
	}

	@Override
	public UserResult register(User user) {
		UserDao userDao = new UserDaoImpl();
		User userByName = userDao.getUserByName(user.getUserName());
		UserResult userResult = new UserResult();
		if(userByName==null){//可以注册
			if(userDao.save(user)){
				userResult.setResult(true);
				userResult.setMessage("注册成功");
			}else{
				userResult.setResult(false);
				userResult.setMessage("未知错误");
			}
		}else{
			userResult.setResult(false);
			userResult.setMessage("注册失败");
		}
		return userResult;
	}

}
