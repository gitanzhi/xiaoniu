package cn.edu360.day02;

public class AppBean {
	
	private String date;
	
	private String userName;
	
	private String appName;
	
	private String from;
	
	private String min;
	
	private String max;

	public AppBean() {
		super();
	}

	public AppBean(String date, String userName, String appName, String from, String min, String max) {
		super();
		this.date = date;
		this.userName = userName;
		this.appName = appName;
		this.from = from;
		this.min = min;
		this.max = max;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getMin() {
		return min;
	}

	public void setMin(String min) {
		this.min = min;
	}

	public String getMax() {
		return max;
	}

	public void setMax(String max) {
		this.max = max;
	}

	@Override
	public String toString() {
		return "AppBean [date=" + date + ", userName=" + userName + ", appName=" + appName + ", from=" + from + ", min="
				+ min + ", max=" + max + "]";
	}
	
	
}
