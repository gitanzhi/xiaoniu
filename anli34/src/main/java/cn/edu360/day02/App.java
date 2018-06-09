package cn.edu360.day02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class App {
	public static void main(String[] args)  {
		//读取数据
		HashMap<String, List<String>> map = getMapInfo();
		ArrayList<AppBean> list = new ArrayList<>();
		Set<Entry<String, List<String>>> entrySet = map.entrySet();
		//对版本排序
		for (Entry<String, List<String>> entry : entrySet) {
			List<String> value = entry.getValue();
			Collections.sort(value, new Comparator<String>() {
				@Override
				public int compare(String o1, String o2) {
					return o1.compareTo(o2);
				}
			});
			
			if(value.size()>1){
				String min = value.get(0);
				String max = value.get(value.size()-1);
				String[] split = entry.getKey().split(",");
				AppBean appBean = new AppBean(split[0],split[1],split[2],split[3],min,max);
				list.add(appBean);
			}
		}
		
		Collections.sort(list, new Comparator<AppBean>() {
			@Override
			public int compare(AppBean o1, AppBean o2) {
				String date1 = o1.getDate();
				String date2 = o2.getDate();
				SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
				try {
					Date parse1 = format.parse(date1);
					Date parse2 = format.parse(date2);
					return parse1.after(parse2)?1:-1;
				} catch (ParseException e) {
					e.printStackTrace();
				}
				return 0;
			}
		});
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\java\\data\\day02write.txt"));) {
			for (AppBean appBean : list) {
				bw.write(appBean.toString());
				bw.newLine();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

	private static HashMap<String, List<String>> getMapInfo() {
		HashMap<String, List<String>> map = new HashMap<>();
		try (BufferedReader br = new BufferedReader(new FileReader("D:\\java\\data\\day02app.txt"));){
			String line = null;
			while((line=br.readLine())!=null){
				//2016-08-15,刘帅老师,斗地主,app store,上海,v2.2
				String[] split = line.split(",");
				String date = split[0];
				String userName = split[1];
				String appName = split[2];
				String from = split[3];
				String version = split[5];
				String key =  date+","+userName+","+appName+","+from;
				boolean isHasKey = map.containsKey(key);
				if(isHasKey){
					List<String> list = map.get(key);
					list.add(version);
					map.put(key, list);
				}else{
					ArrayList<String> list = new ArrayList<>();
					list.add(version);
					map.put(key,list);
				}
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return map;
	}
}
