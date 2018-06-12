package cn.edu360.test;

public class Tag {
	
	private int id;
	
	private String product;
	
	private String tag;
	
	

	public Tag() {
		super();
	}

	public Tag(int id, String product, String tag) {
		super();
		this.id = id;
		this.product = product;
		this.tag = tag;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	@Override
	public String toString() {
		return "Tag [id=" + id + ", product=" + product + ", tag=" + tag + "]";
	}
	
	
}
