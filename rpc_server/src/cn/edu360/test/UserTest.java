package cn.edu360.test;

import org.junit.Test;

import cn.edu360.service.IUserService;
import cn.edu360.service.impl.UserServiceImpl;
import protocal.Result;
import protocal.User;

public class UserTest {
	
	@Test
	public void testUser() {
		IUserService service = new UserServiceImpl();
		
		User u = new User("zs","123456","zhangsan",18,"18738237228","2332@qq.com");
//		try {
//			Result r = service.register(u);
//			System.out.println(r);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		try {
			Result r = service.login("zs", "12");
			System.out.println(r);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
