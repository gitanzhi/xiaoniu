package cn.edu360.day08;

public class DistrictCountBean {
	
	private String name;
	
	private Integer num;

	public DistrictCountBean() {
		super();
	}

	public DistrictCountBean(String name, Integer num) {
		super();
		this.name = name;
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "DistrictCountBean [name=" + name + ", num=" + num + "]";
	}
	
	
}
