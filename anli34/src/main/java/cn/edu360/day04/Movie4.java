package cn.edu360.day04;
/**
 * 4.最热门的3部电影id和评价次数   热门的定义：评次数多的
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.alibaba.fastjson.JSON;

public class Movie4 {
	public static void main(String[] args) {
		//{"movie":"914","rate":"3","timeStamp":"978301968","uid":"1"}
		Map<String, Integer> map = getMap();
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		ArrayList<Entry<String, Integer>> list = new ArrayList<>(entrySet);
		SortUtils.sortByCount(list);
		
		for (int i = 0; i < Math.min(3, list.size()); i++) {
			String movie = list.get(i).getKey();
			Integer count = list.get(i).getValue();
			System.out.println(movie+"的评论是："+count);
		}
		
	}


	private static Map<String, Integer> getMap() {
		HashMap<String, Integer> map = new HashMap<>();
		try(BufferedReader br = new BufferedReader(new FileReader("D:\\java\\data\\day04rating.txt"));) {
			String line = null;
			while((line=br.readLine())!=null){
				MovieBean movieBean = JSON.parseObject(line, MovieBean.class);
				//System.out.println(movieBean);
				String movie = movieBean.getMovie();
				Integer count = map.getOrDefault(movie, 0);
				count++;
				map.put(movie, count);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return map;
	}
}
