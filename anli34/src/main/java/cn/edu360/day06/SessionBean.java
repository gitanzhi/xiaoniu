package cn.edu360.day06;

import java.util.Date;

public class SessionBean {
	
	private String sessionId;
	
	private String ip;
	
	private Date date;
	
	private String url;
	
	private Integer oder;

	public SessionBean() {
		super();
	}

	public SessionBean(String ip, Date date, String url) {
		super();
		this.ip = ip;
		this.date = date;
		this.url = url;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public Integer getOder() {
		return oder;
	}

	public void setOder(Integer oder) {
		this.oder = oder;
	}

	@Override
	public String toString() {
		return "[sessionId=" + sessionId + ", ip=" + ip + ", date=" + date + ", url=" + url + ", oder="
				+ oder + "]";
	}

	

	

	
	
	
}
