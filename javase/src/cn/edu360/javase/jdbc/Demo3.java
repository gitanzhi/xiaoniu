package cn.edu360.javase.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class Demo3 {
	static String url ;
	static String root;
	static String password;
	static{
		try {
			FileInputStream fis = new FileInputStream(new File("config/db.properties"));
			Properties p = new Properties();
			p.load(fis);
			String className = p.getProperty("className");
			url = p.getProperty("url");
			root = p.getProperty("root");
			password = p.getProperty("password");
			Class.forName(className);
			fis.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) throws Exception {
		
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			conn = DriverManager.getConnection(url, root, password);
			st = conn.createStatement();
			/*String sql = "select * from user";
			rs = st.executeQuery(sql); 
			while(rs.next()){
				String string = rs.getString(1);
				System.out.println(string);
			}*/
			
			//增加数据
			/*String sql = "insert into member_cycle values(null,12,33,33)";
			int i = st.executeUpdate(sql);
			System.out.println(i);*/
			
			//删除
			/*String sql = "delete from member_cycle where id>=17";
			int i = st.executeUpdate(sql);
			System.out.println(i);*/
			
			//更新
			/*String sql = "update member_cycle set currentIdweight=2 where id=16";
			int i = st.executeUpdate(sql);
			System.out.println(i);*/
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null){
					rs.close();
					rs=null;
				}
				if(st!=null){
					st.close();
					st=null;
				}
				if(conn!=null){
					conn.close();
					conn=null;
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
}
