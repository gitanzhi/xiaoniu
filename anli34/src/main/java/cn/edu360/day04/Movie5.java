package cn.edu360.day04;
/**
 * 5.评价最高的3部电影id和评分均值
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.alibaba.fastjson.JSON;

public class Movie5 {
	public static void main(String[] args) {
		//{"movie":"914","rate":"3","timeStamp":"978301968","uid":"1"}
		Map<String, List<MovieBean>> map = getMap();
		Set<Entry<String, List<MovieBean>>> entrySet = map.entrySet();
		ArrayList<MovieAvgBean> list = new ArrayList<>();
		for (Entry<String, List<MovieBean>> entry : entrySet) {
			String movie = entry.getKey();
			List<MovieBean> value = entry.getValue();
			double avg = getAvg(value);
			
			MovieAvgBean movieAvgBean = new MovieAvgBean(movie,avg);
			list.add(movieAvgBean);
		}
		SortUtils.sortByMovieAvg(list);
		for (int i = 0; i < Math.min(3, list.size()); i++) {
			System.out.println(list.get(i).getMovie()+"平均分是："+list.get(i).getAvg());
		}
		
	}


	private static double getAvg(List<MovieBean> value) {
		int allRate = 0;
		for (MovieBean movieBean : value) {
			String rate = movieBean.getRate();
			allRate += Integer.parseInt(rate);
		}
		int size = value.size();
		Double avgRate = allRate*1.0/size;
		return avgRate;
	}


	private static Map<String, List<MovieBean>> getMap() {
		HashMap<String, List<MovieBean>> map = new HashMap<>();
		try(BufferedReader br = new BufferedReader(new FileReader("D:\\java\\data\\day04rating.txt"));) {
			String line = null;
			while((line=br.readLine())!=null){
				MovieBean movieBean = JSON.parseObject(line, MovieBean.class);
				//System.out.println(movieBean);
				String movie = movieBean.getMovie();
				List<MovieBean> list = map.getOrDefault(movie, new ArrayList<>());
				list.add(movieBean);
				map.put(movie, list);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return map;
	}
}
