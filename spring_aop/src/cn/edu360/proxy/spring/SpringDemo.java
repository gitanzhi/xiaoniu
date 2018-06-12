package cn.edu360.proxy.spring;

import cn.edu360.proxy.spring.dao.IUserDao;
import cn.edu360.proxy.spring.util.BeanFactory;

/**
 * 模拟Spring框架的AOP
 * 框架：一些类或者接口的集合
 * Spring ：
 * 	IOC
 * 	AOP：面向切面编程
 * 
 * @author Administrator
 *
 */
public class SpringDemo {

	public static void main(String[] args) throws Exception {
		IUserDao dao = BeanFactory.getInstance(IUserDao.class);
		dao.save();
	}

}
