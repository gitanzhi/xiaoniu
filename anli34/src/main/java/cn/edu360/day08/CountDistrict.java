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
				String jobName = split[0];
				String comName = split[1];
				String[] addr = split[2].split(":");
				String[] salary = split[3].split(":");
				String date = split[4];
				if("addr".equals(addr[0].trim())){
					//System.out.println(addr[1]);
					Integer sum = map.getOrDefault(addr[1], 0);
					sum++;
					map.put(addr[1], sum);
				}
				if("salary".equals(salary[0].trim())&&salary.length>1){
					String money = salary[1];
					System.out.println(money);
					if(money.contains("年")){
//						String n1 = money.substring(0, 2);//年薪
//						String n2 = money.substring(3,5);//年薪
//						System.out.println(n1);
//						float f1 = Float.parseFloat(n1);
//						float f2 = Float.parseFloat(n2);
//						float avg = (f1+f2)*10000/2/12;
//						list.add(avg);
					}else{
//						String f1 = money.substring(0, 3);
//						float f5 = Float.parseFloat(f1);
//						String f2 = money.substring(4,7);
//						if(f2.contains("万")){
//							
//						}
					}
				}

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+entry.getValue());
		}
	}
	
	 public static boolean isInteger(String str) {  
	        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");  
	        return pattern.matcher(str).matches();  
	  }
}
