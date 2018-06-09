package cn.edu360.day07;
/**
 * 封装单车数据
 * @author Administrator
 *
 */
public class BikeBean {
	//{"event_type":0,"page":"/pages/index/index","time":"2018-03-14 12:35:14","uid":"oDK8U0c_VZqQTMVsab9oM219vZpw","longitude":126.67032,"latitude":45.767525,"province":"黑龙江省","city":"哈尔滨市","district":"南岗区"}
	private String eventType;
	
	private String page;
	
	private String time;
	
	private String uid;
	
	private String longitude;
	
	private String latitude;
	
	private String province;
	
	private String city;
	
	private String district;

	public BikeBean() {
		super();
	}

	public BikeBean(String eventType, String page, String time, String uid, String longitude, String latitude,
			String province, String city, String district) {
		super();
		this.eventType = eventType;
		this.page = page;
		this.time = time;
		this.uid = uid;
		this.longitude = longitude;
		this.latitude = latitude;
		this.province = province;
		this.city = city;
		this.district = district;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
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

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	@Override
	public String toString() {
		return "BikeBean [eventType=" + eventType + ", page=" + page + ", time=" + time + ", uid=" + uid
				+ ", longitude=" + longitude + ", latitude=" + latitude + ", province=" + province + ", city=" + city
				+ ", district=" + district + "]";
	}
	
	
}
