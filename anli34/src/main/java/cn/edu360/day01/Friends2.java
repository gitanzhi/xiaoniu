package cn.edu360.day01;
/**
 * 第二种方法实现排序
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.dbutils.QueryRunner;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class Friends2 {
	public static void main(String[] args) throws Exception {
		HashMap<String, Integer> map = getMap();
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		ArrayList<Entry<String, Integer>> list = new ArrayList<>(entrySet);
		//利用set的排序
		Collections.sort(list,new Comparator<Entry<String, Integer>>() {
			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o2.getValue()-o1.getValue();
			}
		});
		System.out.println(list);
		//保存到数据库
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		QueryRunner runner = new QueryRunner(dataSource);
		for (Entry<String, Integer> entry : list) {
			String sql = "insert into test values(null,?,?)";
			runner.update(sql,entry.getKey(),entry.getValue()+"");
		}
		
	}
	
	/**
	 * 返回map数据
	 * @return
	 */
	private static HashMap<String, Integer> getMap() {
		HashMap<String, Integer> map = new HashMap<>();
		try (BufferedReader br = new BufferedReader(new FileReader("D:\\java\\data\\day01haoyou.txt"));){
			String line = null;
			while((line = br.readLine())!=null){
				String[] split = line.split(":");
				String uid = split[0];
				int length = split[1].split(",").length;
				map.put(uid, length);
			}
		} catch (Exception e) {
			
		}
		return map;
	}
	
	
}
