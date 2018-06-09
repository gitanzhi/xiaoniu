package cn.edu360.day01;

import org.apache.commons.dbutils.QueryRunner;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class TestComboPooledDataSource {
	public static void main(String[] args) throws Exception {
		ComboPooledDataSource source = new ComboPooledDataSource();
		QueryRunner runner = new QueryRunner(source);
		String sql = "insert into test values(null,?,?)";
		int i = runner.update(sql,"哈哈",12);
		System.out.println(i);
	}	
	
}
