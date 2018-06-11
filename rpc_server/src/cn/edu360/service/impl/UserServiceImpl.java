package cn.edu360.service.impl;

import cn.edu360.dao.IUserDao;
import cn.edu360.dao.impl.UserDaoImpl;
import cn.edu360.service.IUserService;
import protocal.Result;
import protocal.User;

public class UserServiceImpl implements IUserService {

	IUserDao dao = new UserDaoImpl();
	
	@Override
	public Result register(User u) throws Exception {
		User user = dao.getUserByUserName(u.getUserName());
		Result r = new Result();
		if(user!=null) {
			r.setStatus(false);
			r.setDesc("用户已存在");
		}else {
			r.setStatus(dao.save(u));
		}
		return r;
	}

	@Override
	public Result login(String userName, String password) throws Exception {
		User user = dao.getUserByUserName(userName);
		Result r = new Result();
		if(user == null) {
			r.setStatus(false);
			r.setDesc("用户不存在");
		}else {
			if(user.getPassword().equals(password)) {
				r.setStatus(true);
				r.setDesc("登陆成功");
			}else {
				r.setStatus(false);
				r.setDesc("用户名或密码错误");
			}
		}
		return r;
		
	}

}
