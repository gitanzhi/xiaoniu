package cn.edu360.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.util.Set;

public class Demo4 {
	public static void main(String[] args) throws Exception {
		
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		QueryRunner runner = new QueryRunner(dataSource);
		String sql = "select * from tag";
		List<Tag> list = runner.query(sql, new BeanListHandler<Tag>(Tag.class));
		System.out.println(list);
		String insertSql = "insert into user_tag values(null,?,?)";
		try(BufferedReader br = new BufferedReader(new FileReader("D:\\java\\data\\anlitest\\orderlog.log"));) {
			String line = null;
			while((line=br.readLine())!=null){
				String[] split = line.split(" ");
				String uid = split[0];
				String ip = split[1];
				String category = split[2];
				String product = split[3];
				Integer money = Integer.parseInt(split[4]);
				for (Tag tag : list) {
					if(product.equals(tag.getProduct())){
						int i = runner.update(insertSql, uid,tag.getId());
					}
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("over");
		
	}

	
}
