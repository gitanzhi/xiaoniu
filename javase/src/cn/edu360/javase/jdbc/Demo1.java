package cn.edu360.javase.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

/**
 * 注册驱动
 * 建立连接
 * 获取执行sql的连接
 * 执行sql
 * 释放资源
 */
public class Demo1 {
	
	public static void main(String[] args) throws Exception {
		//注册驱动，参数，连接数据库的类型
		
		//DriverManager.registerDriver(new Driver());
		//new Driver();
		//解决2次注册驱动的问题
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "123456");
		Statement st = conn.createStatement();
		String sql = "select * from user";
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()){
			String string = rs.getString(2);
			System.out.println(string);
		}
		rs.close();
		st.close();
		conn.close();
	}
}
