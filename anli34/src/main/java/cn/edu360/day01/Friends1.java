package cn.edu360.day01;
/**
 * 第一种方法实现排序
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Friends1 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = getMap();
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		
		ArrayList<UidCountBean> list = new ArrayList<>();
		for (Entry<String, Integer> entry : entrySet) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			UidCountBean uidCountBean = new UidCountBean(key,value);
			list.add(uidCountBean);
		}
		Collections.sort(list, new Comparator<UidCountBean>() {
			@Override
			public int compare(UidCountBean o1, UidCountBean o2) {
				return o2.getLength()-o1.getLength();
			}
		});
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\java\\data\\day01write.txt"));){
			for (UidCountBean bean : list) {
				bw.write(bean.toString());
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 返回map数据
	 * @return
	 */
	private static HashMap<String, Integer> getMap() {
		HashMap<String, Integer> map = new HashMap<>();
		try (BufferedReader br = new BufferedReader(new FileReader("D:\\java\\data\\day01haoyou.txt"));){
			String line = null;
			while((line = br.readLine())!=null){
				String[] split = line.split(":");
				String uid = split[0];
				int length = split[1].split(",").length;
				map.put(uid, length);
			}
		} catch (Exception e) {
			
		}
		return map;
	}
	
	
}
