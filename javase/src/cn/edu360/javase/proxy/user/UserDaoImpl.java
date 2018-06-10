package cn.edu360.javase.proxy.user;

public class UserDaoImpl implements IuserDao{

	@Override
	public boolean save() {
		System.out.println("保存成功");
		return true;
	}

	@Override
	public boolean update() {
		System.out.println("更新成功");
		return true;
	}

}
