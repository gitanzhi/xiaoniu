package cn.edu360.day03;

public class IpBean {
	
	private String startIp;
	
	private String endIp;
	
	private Long startDecIp;
	
	private Long endDecIp;
	
	private String province;
	
	private String city;
	
	private String optioner;

	public IpBean() {
		super();
	}

	public IpBean(String startIp, String endIp, Long startDecIp, Long endDecIp, String province, String city,
			String optioner) {
		super();
		this.startIp = startIp;
		this.endIp = endIp;
		this.startDecIp = startDecIp;
		this.endDecIp = endDecIp;
		this.province = province;
		this.city = city;
		this.optioner = optioner;
	}

	public String getStartIp() {
		return startIp;
	}

	public void setStartIp(String startIp) {
		this.startIp = startIp;
	}

	public String getEndIp() {
		return endIp;
	}

	public void setEndIp(String endIp) {
		this.endIp = endIp;
	}

	public Long getStartDecIp() {
		return startDecIp;
	}

	public void setStartDecIp(Long startDecIp) {
		this.startDecIp = startDecIp;
	}

	public Long getEndDecIp() {
		return endDecIp;
	}

	public void setEndDecIp(Long endDecIp) {
		this.endDecIp = endDecIp;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getOptioner() {
		return optioner;
	}

	public void setOptioner(String optioner) {
		this.optioner = optioner;
	}

	@Override
	public String toString() {
		return "IpBean [startIp=" + startIp + ", endIp=" + endIp + ", startDecIp=" + startDecIp + ", endDecIp="
				+ endDecIp + ", province=" + province + ", city=" + city + ", optioner=" + optioner + "]";
	}

	
	
	
}
