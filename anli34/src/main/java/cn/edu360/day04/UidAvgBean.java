package cn.edu360.day04;

public class UidAvgBean {
	
	private String uid;
	
	private Double avg;

	public UidAvgBean() {
		super();
	}

	public UidAvgBean(String uid, Double avg) {
		super();
		this.uid = uid;
		this.avg = avg;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public Double getAvg() {
		return avg;
	}

	public void setAvg(Double avg) {
		this.avg = avg;
	}

	@Override
	public String toString() {
		return "UidAvgBean [uid=" + uid + ", avg=" + avg + "]";
	}
	
	
}
