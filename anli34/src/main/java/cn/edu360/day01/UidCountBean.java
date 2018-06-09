package cn.edu360.day01;

public class UidCountBean {
	
	private String uid;
	
	private Integer length;
	
	public UidCountBean() {
		super();
	}
	
	public UidCountBean(String uid, Integer length) {
		super();
		this.uid = uid;
		this.length = length;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "[uid=" + uid + ", length=" + length + "]";
	}
	
}
