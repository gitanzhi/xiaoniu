package cn.edu360.day06;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Session {
	public static void main(String[] args) {
		
		HashMap<String, List<SessionBean>> sessionMap = new HashMap<>();//相同session的数据
		Map<String, List<SessionBean>> map = getMap();
		Map<String, List<SessionBean>> sortByDate = sortByDate(map);
		
		makeSessionId(map);
		
		Set<Entry<String, List<SessionBean>>> entrySet = map.entrySet();
		for (Entry<String, List<SessionBean>> entry : entrySet) {
			List<SessionBean> list = entry.getValue();
			for (SessionBean sessionBean : list) {
				List<SessionBean> list2 = sessionMap.getOrDefault(sessionBean.getSessionId(), new ArrayList<SessionBean>());
				list2.add(sessionBean);
				sessionMap.put(sessionBean.getSessionId(), list2);
			}
		}
		//取出第一个和最后一个sessionBean
		for (Entry<String, List<SessionBean>> entry : map.entrySet()) {
			List<SessionBean> list = entry.getValue();
			SessionBean first = list.get(0);
			SessionBean end = list.get(list.size()-1);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String firstDate = sdf.format(first.getDate());
			String endDate = sdf.format(end.getDate());
			long time = (end.getDate().getTime()-first.getDate().getTime())/1000;
			String ret = entry.getKey()+"\t"+first.getIp()+"\t"+firstDate+"\t"+endDate+"\t"+first.getUrl()+"\t"+end.getUrl()+"\t"+time+"s";
			System.out.println(ret);
		}
	}

	private static void makeSessionId(Map<String, List<SessionBean>> map) {
		Set<Entry<String, List<SessionBean>>> entrySet = map.entrySet();
		for (Entry<String, List<SessionBean>> entry : entrySet) {
			List<SessionBean> list = entry.getValue();
			if(list.size()==1){
				SessionBean sessionBean = list.get(0);
				String uuid = UUID.randomUUID().toString();
				sessionBean.setSessionId(uuid);
				sessionBean.setOder(1);
			}
			//不等于1的时候
			for (int i = 0; i < list.size()-1; i++) {
				SessionBean bean1 = list.get(i);
				SessionBean bean2 = list.get(i+1);
				Boolean flag = isSameSession(bean1,bean2);
				if(flag){
					if(bean1.getSessionId()!=null){
						bean2.setSessionId(bean1.getSessionId());
						bean2.setOder(bean1.getOder()+1);
					}else{
						bean1.setSessionId(UUID.randomUUID().toString());
						bean1.setOder(1);
						bean2.setSessionId(bean1.getSessionId());
						bean2.setOder(bean1.getOder()+1);
					}
				}else{
					//两个不相同
					if(bean1.getSessionId()==null){
						bean1.setSessionId(UUID.randomUUID().toString());
						bean1.setOder(1);
					}
					bean2.setSessionId(UUID.randomUUID().toString());
					bean2.setOder(1);
				}
			}
		}
	}

	private static Boolean isSameSession(SessionBean bean1, SessionBean bean2) {
		long date1 = bean1.getDate().getTime();
		long date2 = bean2.getDate().getTime();
		if(date2-date1<=1000*60*30){
			return true;
		}
		return false;
	}

	private static Map<String, List<SessionBean>> sortByDate(Map<String, List<SessionBean>> map) {
		Set<Entry<String, List<SessionBean>>> entrySet = map.entrySet();
		for (Entry<String, List<SessionBean>> entry : entrySet) {
			List<SessionBean> list = entry.getValue();
			Collections.sort(list, new Comparator<SessionBean>() {

				@Override
				public int compare(SessionBean o1, SessionBean o2) {
					
					return o1.getDate().after(o2.getDate())?1:-1;
				}
			});
		}
		return map;
	}

	/**
	 * 得到一个ip的list集合session
	 */
	private static Map<String, List<SessionBean>> getMap() {
		HashMap<String, List<SessionBean>> map = new HashMap<>();
		try (BufferedReader br = new BufferedReader(new FileReader("D:\\java\\data\\day06access.log.fensi"));) {
			String line = null;
			//163.177.71.12 - - [18/Sep/2013:06:49:36 +0000] "HEAD / HTTP/1.1" 200 20 "-" "DNSPod-Monitor/1.0"
			while((line=br.readLine())!=null){
				String ip = getDataByRegex(line,"(\\d+\\.){3}\\d+");
				Date date = parseDate(getDataByRegex(line,"\\[.+\\d+\\]"));
				String url = getDataByRegex(line,"(POST|GET){1}\\s(\\S)*\\s");
				if(ip!=null&&date!=null&&url!=null){
					SessionBean sessionBean = new SessionBean(ip,date,url);
					List<SessionBean> list = map.getOrDefault(ip, new ArrayList<SessionBean>());
					list.add(sessionBean);
					map.put(ip, list);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	}
	
	private static Date parseDate(String dataByRegex) {
		//18/Sep/2013:06:51:35 +0000
		String dateStr = dataByRegex.substring(1, dataByRegex.length()-1);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy:HH:mm:ss",Locale.US);
		try {
			Date date = sdf.parse(dateStr);
			return date;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static String getDataByRegex(String line , String regex) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(line);
		while(matcher.find()){
			String group = matcher.group();
			return group;
		}
		return null;
	}
}
