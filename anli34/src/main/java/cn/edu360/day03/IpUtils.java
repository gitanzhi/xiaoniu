package cn.edu360.day03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import sun.awt.OSInfo.OSType;

public class IpUtils {
	
	static List<IpBean> list = null;
	
	static{
		 list = loadIpData();
	}
		
	public static Long strIpToLongIp(String ip){
		if(ip==null){
			return 0l;
		}
		Long newIp = 0l;
		String[] split = ip.split("\\.");
		
		for (int i = 0; i < 4; i++) {
			long ll = Long.parseLong(split[i]); //192
			newIp |= ll<<((3-i)<<3);
		}
		return newIp ;
	}
	
	public static List<IpBean> loadIpData () {
		
		ArrayList<IpBean> list = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader("D:\\java\\data\\day03ip.txt"));) {
			String line = null;
			while((line=br.readLine())!=null){
				String[] split = line.split("\\|");
				//1.2.0.0|1.2.1.255|16908288|16908799|亚洲|中国|福建|福州||电信|350100|China|CN|119.306239|26.075302
				String startIp = split[0];
				String endIp = split[1];
				String startDecIp = split[2];
				String endDecIp = split[3];
				String province = split[6];
				String city = split[7];
				String optioner = split[9];
				IpBean ipBean = new IpBean(startIp,endIp,Long.parseLong(startDecIp),Long.parseLong(endDecIp),province,city,optioner);
				list.add(ipBean);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Deprecated
	public static IpBean getBeanByIp(Long ip) {
		for (IpBean ipBean : list) {
			if(ip>ipBean.getStartDecIp()&&ip<ipBean.getEndDecIp()){
				return ipBean;
			}
		}
		return null;
	}
	
	public static IpBean getBeanByIpNew(Long ip) {
		int start = 0;
		int end = list.size()-1;
		while(start<=end){
			int mid = (start+end)/2;
			IpBean ipBean = list.get(mid);
			if(ip<=ipBean.getEndDecIp()&&ip>=ipBean.getStartDecIp()){
				return ipBean;
			}
			if(ip<ipBean.getEndDecIp()){
				end = mid-1;
			}
			if(ip>ipBean.getEndDecIp()){
				start = mid+1;
			}
		}
		return null;			
	}
}
