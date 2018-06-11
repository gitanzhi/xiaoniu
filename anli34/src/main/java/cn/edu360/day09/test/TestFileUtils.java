package cn.edu360.day09.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import cn.edu360.day09.dao.UserDao;
import cn.edu360.day09.dao.impl.UserDaoImpl;
import cn.edu360.day09.model.User;
import cn.edu360.day09.model.UserResult;
import cn.edu360.day09.service.UserService;
import cn.edu360.day09.service.impl.UserServiceImpl;
import cn.edu360.day09.utils.FileUtils;

public class TestFileUtils {
	
	@Test
	public void testFileUtils(){
		HashMap<String, User> map = new HashMap<>();
		map.put("mingming", new User("mingming", "123456", "明明"));
		FileUtils.saveMapToFile(map);
		Map<String, User> userMapByFile = FileUtils.getUserMapByFile();
		System.out.println(userMapByFile);
	}
	
	@Test
	public void testUserDao(){
		UserDao dao = new UserDaoImpl();
		//boolean save = dao.save(new User("lulu", "123", "露露"));
		//System.out.println(save);
		User user = dao.getUserByName("mingming");
		System.out.println(user);
		
	}
	
	@Test
	public void testUserService(){
		UserService userService = new UserServiceImpl();
		UserResult register = userService.register(new User("huahua", "123", "花花"));
		System.out.println(register);
		UserResult login = userService.login(new User("migming", "12356", "min"));
		System.out.println(login);
	}
}
