package cn.edu360.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo3 {
	public static void main(String[] args) {
		
		HashMap<String, Integer> cateMap = new HashMap<>();
		try(BufferedReader br = new BufferedReader(new FileReader("D:\\java\\data\\anlitest\\orderlog.log"));) {
			String line = null;
			while((line=br.readLine())!=null){
				String[] split = line.split(" ");
				String uid = split[0];
				String ip = split[1];
				String category = split[2];
				String product = split[3];
				Integer money = Integer.parseInt(split[4]);
				Integer sum = cateMap.getOrDefault(category, 0);
				sum+=money;
				cateMap.put(category, sum);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		Set<Entry<String, Integer>> entrySet = cateMap.entrySet();
		List<Entry<String, Integer>> list = new ArrayList<>(entrySet);
		System.out.println(list);
		Collections.sort(list, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o2.getValue()-o1.getValue();
			}
		});
		System.out.println(list);
	}

	
}
