package cn.edu360.day04;
/**
 * 最大方(评分平均值高)的3个用户的uid和评分平均值
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.alibaba.fastjson.JSON;

public class Movie3 {
	public static void main(String[] args) {
		//{"movie":"914","rate":"3","timeStamp":"978301968","uid":"1"}
		Map<String, List<MovieBean>> map = getMap();
		Set<Entry<String, List<MovieBean>>> entrySet = map.entrySet();
		ArrayList<UidAvgBean> list = new ArrayList<>();
		for (Entry<String, List<MovieBean>> entry : entrySet) {
			String uid = entry.getKey();
			List<MovieBean> value = entry.getValue();
			Double avgRate = getAvg(value);
		
			UidAvgBean uidAvgBean = new UidAvgBean(uid,avgRate);
			list.add(uidAvgBean);
		}
		SortUtils.sortByAvg(list);
		for (int i = 0; i < Math.min(3, list.size()); i++) {
			System.out.println(list.get(i));
		}
		
	}

	private static Double getAvg(List<MovieBean> value) {
		int allRate = 0;
		for (MovieBean movieBean : value) {
			String rate = movieBean.getRate();
			allRate += Integer.parseInt(rate);
		}
		int size = value.size();
		Double avgRate = allRate*1.0/size;
		return avgRate;
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
