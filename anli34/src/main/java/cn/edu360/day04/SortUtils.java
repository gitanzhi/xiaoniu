package cn.edu360.day04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;

public class SortUtils {

	/**
	 * 按电影评分排序
	 * @param value
	 */
	public static void sortByRate(List<MovieBean> value) {
		Collections.sort(value, new Comparator<MovieBean>() {

			@Override
			public int compare(MovieBean o1, MovieBean o2) {
				return o2.getRate().compareTo(o1.getRate());
			}
		});
	}
	
	/**
	 * uid 平均分 排序
	 * @param list
	 */
	public static void sortByAvg(ArrayList<UidAvgBean> list) {
		Collections.sort(list, new Comparator<UidAvgBean>() {

			@Override
			public int compare(UidAvgBean o1, UidAvgBean o2) {
				return  o2.getAvg()-o1.getAvg()>0?1:-1;
			}
		});
	}
	
	/**
	 * 电影评论次数排序 
	 * @param list
	 */
	public static void sortByCount(ArrayList<Entry<String, Integer>> list) {
		Collections.sort(list, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o2.getValue()-o1.getValue();
			}
		});
	}
	
	/**
	 * 电影平均分排序
	 * @param list
	 */
	public static void sortByMovieAvg(ArrayList<MovieAvgBean> list) {
		Collections.sort(list, new Comparator<MovieAvgBean>() {

			@Override
			public int compare(MovieAvgBean o1, MovieAvgBean o2) {
				return o2.getAvg()-o1.getAvg()>0?1:-1;
			}
		});
		
	}

}
