package cn.edu360.javase.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	
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
