package cn.edu360.test;

public class OrderBean {
	
	private String Uid;
	
	private String ip;
	
	private String category;
	
	private String product;
	
	private int money;

	public OrderBean() {
		super();
	}

	public OrderBean(String uid, String ip, String category, String product, int money) {
		super();
		Uid = uid;
		this.ip = ip;
		this.category = category;
		this.product = product;
		this.money = money;
	}

	public String getUid() {
		return Uid;
	}

	public void setUid(String uid) {
		Uid = uid;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "OrderBean [Uid=" + Uid + ", ip=" + ip + ", category=" + category + ", product=" + product + ", money="
				+ money + "]";
	}
	
	
}
