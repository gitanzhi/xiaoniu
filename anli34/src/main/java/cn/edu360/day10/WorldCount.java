package cn.edu360.day10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WorldCount {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		try(BufferedReader br = new BufferedReader(new FileReader("D:\\java\\data\\day10UserServiceImpl.java"));) {
			String line = null;
			while((line=br.readLine())!=null){
				Pattern p = Pattern.compile("\\b\\w+\\b");
				Matcher matcher = p.matcher(line);
				while(matcher.find()){
					String group = matcher.group();
					//System.out.println(group);
					Integer sum = map.getOrDefault(group, 0);
					sum++;
					map.put(group, sum);
				}
			}
			Set<Entry<String, Integer>> entrySet = map.entrySet();
			for (Entry<String, Integer> entry : entrySet) {
				System.out.println(entry);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
