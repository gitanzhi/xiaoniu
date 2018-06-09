package cn.edu360.day04;
/**
 * 1.每个用户评分最高的3部电影评分信息
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class Movie1 {
	public static void main(String[] args) {
		//{"movie":"914","rate":"3","timeStamp":"978301968","uid":"1"}
		Map<String, List<MovieBean>> map = getMap();
		Set<Entry<String, List<MovieBean>>> entrySet = map.entrySet();
		for (Entry<String, List<MovieBean>> entry : entrySet) {
			List<MovieBean> value = entry.getValue();
			SortUtils.sortByRate(value);
			System.out.println("uid:"+entry.getKey());
			for (int i = 0; i < Math.min(3, value.size()); i++) {
				System.err.println(value.get(i));
			}
		}
		
	}

	/**
	 * 通过文件获取每个uid的集合
	 * @return
	 */
	private static Map<String, List<MovieBean>> getMap() {
		HashMap<String, List<MovieBean>> map = new HashMap<>();
		try(BufferedReader br = new BufferedReader(new FileReader("D:\\java\\data\\day04rating.txt"));) {
			String line = null;
			while((line=br.readLine())!=null){
				MovieBean movieBean = JSON.parseObject(line, MovieBean.class);
				//System.out.println(movieBean);
				String uid = movieBean.getUid();
				List<MovieBean> list = map.getOrDefault(uid, new ArrayList<MovieBean>());
				list.add(movieBean);
				map.put(uid, list);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return map;
	}
}
