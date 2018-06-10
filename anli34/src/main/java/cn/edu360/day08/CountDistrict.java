package cn.edu360.day08;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.regex.Pattern;

public class CountDistrict {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		ArrayList<Float> list = new ArrayList<>();
		try(BufferedReader br = new BufferedReader(new FileReader("D:\\java\\data\\day08result.txt"));) {
			String line = null;
			//jobName=大数据销售经理, comName=上海德拓信息技术股份有限公司, addr=北京-海淀区, salary=1.2-2万/月, date=06-09
			while((line=br.readLine())!=null){
				String[] split = line.split(",");
				String[] addr = split[2].split(":");
				String[] salary = split[3].split(":");
				//算出哪个区域多少岗位
				if("addr".equals(addr[0].trim())&&addr.length>1){
					Integer sum = map.getOrDefault(addr[1], 0);
					sum++;
					map.put(addr[1], sum);
				}
				if("salary".equals(salary[0].trim())&&salary.length>1){
					String moneystr = salary[1];
					try {
						String[] split2 = moneystr.split("\\/");
						String salaryRangeStr = split2[0];
						System.out.println(salaryRangeStr);
						if(split2.length>1&&"年".equals(split2[1].trim())){
							//年
							
							String[] split3 = salaryRangeStr.split("\\-");
							
							
						}
					} catch (Exception e) {
						e.printStackTrace();
						continue;
					}
					
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
//		for (Entry<String, Integer> entry : map.entrySet()) {
//			System.out.println(entry.getKey()+entry.getValue());
//		}
	}
	
	 public static boolean isInteger(String str) {  
	        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");  
	        return pattern.matcher(str).matches();  
	  }
}
