package cn.edu360.day05;
/**
 * 2.根据给的手机号段归属地规则，计算出总流量最高的省份Top3
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;


public class Flow2 {
	public static void main(String[] args) {
		HashMap<String, String> map = getMap();
		HashMap<String, Long> map2 = new HashMap<>();
		try(BufferedReader br = new BufferedReader(new FileReader("D:\\java\\data\\day05http.log"));) {
			String line = null;
			//13905256439	http://movie.youku.com 10132 538
			while((line=br.readLine())!=null){
				String[] split = line.split("\\s+");
				String phone = split[0].substring(0, 7);//手机号
				Long up = Long.parseLong(split[2]);
				Long down = Long.parseLong(split[3]);
				String province = map.get(phone);
				Long sum = map2.getOrDefault(province, 0L);
				sum = sum+up+down;
				map2.put(province, sum);
			}
			Set<Entry<String, Long>> entrySet = map2.entrySet();
			ArrayList<Entry<String, Long>> list = new ArrayList<>(entrySet);
			SortUtils.sortByFlow(list);
			for (int i = 0; i < Math.min(3, list.size()); i++) {
				System.out.println(list.get(i).getKey()+":"+list.get(i).getValue());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 获取手机号前7位对应的省份
	 * @return
	 */
	private static HashMap<String, String> getMap() {
		HashMap<String, String> map = new HashMap<>();
		try(BufferedReader br = new BufferedReader(new FileReader("D:\\java\\data\\day05phone.txt"));) {
			String line = null;
			//130	1300000	山东	济南	联通	250000	0531	370100
			br.readLine();//跳过第一行
			while((line=br.readLine())!=null){
				String[] split = line.split("\t");
				String phone = split[1];//前7位
				String province = split[2];//省份
				map.put(phone, province);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	}


	
}
