package cn.edu360.day05;
/**
 * 1.根据给的用户上网日志记录数据，计算出总流量最高的网站Top3(网站例如：v.baidu.com，weibo.com)
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Flow1 {
	public static void main(String[] args) {
		HashMap<String, Long> map = new HashMap<>();
		try(BufferedReader br = new BufferedReader(new FileReader("D:\\java\\data\\day05http.log"));) {
			String line = null;
			//15639120688	http://v.baidu.com/movie 3936 12058
			while((line=br.readLine())!=null){
				String[] split = line.split("\t")[1].split(" ");
				String oldUrl = split[0];
				long up = Long.parseLong(split[1]);
				long down = Long.parseLong(split[2]);
				String url = getUrlByRegex(oldUrl);
				Long sum = map.getOrDefault(url, 0L);
				sum = sum+up+down;
				map.put(url, sum);
			}
			Set<Entry<String, Long>> entrySet = map.entrySet();
			ArrayList<Entry<String, Long>> list = new ArrayList<>(entrySet);
			SortUtils.sortByFlow(list);
			for (int i = 0; i < Math.min(3, list.size()); i++) {
				System.out.println(list.get(i).getKey()+" "+list.get(i).getValue());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static String getUrlByRegex(String oldUrl) {
		Pattern compile = Pattern.compile("(\\w+\\.)?(\\w+\\.){1}\\w+");
		Matcher matcher = compile.matcher(oldUrl);
		while(matcher.find()){
			String ret = matcher.group();
			return ret;
		}
		return null;
	}

	
}
