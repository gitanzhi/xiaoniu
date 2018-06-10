package cn.edu360.javase.jdbc.pool;

import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.runner.Runner;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import cn.edu360.javase.jdbc.bean.MemberCycle;

public class Demo {
	
	public static void main(String[] args) throws Exception {
		//数据库连接池 自动读取文件的四个参数
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		/*String sql = "select * from member_cycle";
		//工具类执行sql
		QueryRunner runner = new QueryRunner(dataSource);
		List<MemberCycle> list = runner.query(sql, new BeanListHandler<MemberCycle>(MemberCycle.class));
		System.out.println(list);*/
		
		/*String sql = "select * from member_cycle where id = ?";
		QueryRunner runner = new QueryRunner(dataSource);
		MemberCycle mc = runner.query(sql, new BeanHandler<MemberCycle>(MemberCycle.class),2);
		System.out.println(mc);*/
		
		String sql = "insert into member_cycle values(null,?,?,?)";
		QueryRunner runner = new QueryRunner(dataSource);
		runner.update(sql,12,2,2);
	}
	
}
