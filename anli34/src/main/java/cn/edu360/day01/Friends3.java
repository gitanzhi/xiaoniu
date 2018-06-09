package cn.edu360.day01;
/**
 *	两两共同好友
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Friends3 {
	public static void main(String[] args) {
		HashMap<String, List<String>> map = getMap();
		
		Set<String> keySet = map.keySet();
		ArrayList<String> list = new ArrayList<>(keySet);
		
		for(int i=0;i<keySet.size();i++){
			String uidi = list.get(i);
			List<String> listi = map.get(uidi);
			for(int j=i+1;j<keySet.size();j++){
				String uidj = list.get(j);
				List<String> listj = map.get(uidj);
				ArrayList<String> newList = new ArrayList<>(listj);
				newList.retainAll(listi);
				if(newList!=null&&newList.size()!=0){
					System.out.println(uidi+"和"+uidj+"的公共好友是："+newList);
				}
			}
		}
		
	}
	
	/**
	 * 返回map数据
	 * @return
	 */
	private static HashMap<String, List<String>> getMap() {
		HashMap<String, List<String>> map = new HashMap<>();
		try (BufferedReader br = new BufferedReader(new FileReader("D:\\java\\data\\day01haoyou.txt"));){
			String line = null;
			while((line = br.readLine())!=null){
				String[] split = line.split(":");
				String uid = split[0];
				String[] fss = split[1].split(",");
				List<String> list = Arrays.asList(fss);//生成的list不可增删
				map.put(uid, list);
				
			}
		} catch (Exception e) {
			
		}
		return map;
	}
	
	
}
