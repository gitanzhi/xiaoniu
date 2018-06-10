package cn.edu360.javase.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author liuming
 * @date 2018年4月15日  下午5:43:22
 */
public class DateDemo {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		Date date = new Date();//精确到毫秒
		System.out.println(date);
		Date date1 = new Date(System.currentTimeMillis());
		System.out.println(date1);
		
		
		System.out.println(date.getTime());
		date.setTime(date.getTime()+200);
		
		//date转string
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM");
		String datestr = sdf1.format(date);
		System.out.println(datestr);
		System.out.println(formatDate(date1, "yyyyMMdd"));
		
		
		
		
		//String转date 
		Date date2 = formatDate("2017","yyyy");
		System.out.println(date2);
		
	}
	
	public static Date formatDate(String datestr,String pattern) throws ParseException {
		SimpleDateFormat sdf1 = new SimpleDateFormat(pattern);
		Date date = sdf1.parse(datestr);
		return date;
	}
	
	public static String formatDate(Date date,String pattern) {
		SimpleDateFormat sdf1 = new SimpleDateFormat(pattern);
		return sdf1.format(date);
	}

}
