package cn.edu360.proxy.spring.dao.impl;

import cn.edu360.proxy.spring.dao.IUserDao;

public class IUserDaoImpl implements IUserDao{

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("保存成功");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("更新成功");
	}

}
