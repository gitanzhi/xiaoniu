package cn.edu360.day09.dao.impl;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import cn.edu360.day09.dao.UserDao;
import cn.edu360.day09.model.User;
import cn.edu360.day09.utils.Const;
import cn.edu360.day09.utils.FileUtils;

public class UserDaoImpl implements UserDao {

	@Override
	public boolean save(User user) {
		File file = new File(Const.FILE_PATH);
		Map<String, User> map = null;
		if(file.exists()){//不是第一个保存的用户
			map = FileUtils.getUserMapByFile();
		}else{//是第一个保存的用户
			map = new HashMap<>();
		}
		map.put(user.getUserName(), user);
		FileUtils.saveMapToFile(map);
		return true;
	}

	@Override
	public User getUserByName(String userName) {
		File file = new File(Const.FILE_PATH);
		if(file.exists()){
			Map<String, User> map = FileUtils.getUserMapByFile();
			User user = map.get(userName);
			return user;
		}
		return null;
	}

}
