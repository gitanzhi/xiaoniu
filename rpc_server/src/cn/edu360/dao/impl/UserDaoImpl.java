package cn.edu360.dao.impl;

import java.io.File;
import java.util.HashMap;

import cn.edu360.dao.IUserDao;
import cn.edu360.utils.FileUtil;
import protocal.User;

public class UserDaoImpl implements IUserDao {
	
	FileUtil<User> util = new  FileUtil<User>();
	
	@Override
	public boolean save(User u) throws Exception {
		File file = new File(FileUtil.PATH);
		HashMap<String, User> map = null;
		if(file.exists()) {
			map = util.readMapFromFile();
			
		}else {
			map = new HashMap<String,User>();
		}
		//新用户放到map
		
		map.put(u.getUserName(), u);
		
		util.writeMapToFile(map);
		return true;
	}

	@Override
	public User getUserByUserName(String userName) throws Exception {
		File file = new File(FileUtil.PATH);
		HashMap<String, User> map = null;
		if(file.exists()) {
			map = util.readMapFromFile();
			return map.get(userName);
		}
		
		return null;
	}

}
