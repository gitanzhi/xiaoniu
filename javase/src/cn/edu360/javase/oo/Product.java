package cn.edu360.javase.oo;
/**
 * 使用javabean
 * 别名 pojo,domain,model,vo(value object)
 * @author Liu Ming
 * @createdTime 2018年4月14日 下午4:59:43
 */
public class Product {
	
	private String proId;
	
	private String proName;
	
	private int proCount;
	
	private String proImg;
	
	private double proPrice;
	
	private String proDesc;
	
	public Product() {
		
	}
	
	public Product(String proId, String proName, int proCount, String proImg, double proPrice, String proDesc) {
		super();
		this.proId = proId;
		this.proName = proName;
		this.proCount = proCount;
		this.proImg = proImg;
		this.proPrice = proPrice;
		this.proDesc = proDesc;
	}

	public void show() {
		System.out.println("proId:"+proId+",proName:"+proName+",proImg:"+proImg+",proPrice:"+proPrice+",数量:"+proCount+",描述:"+proDesc);
	}

	public String getProId() {
		return proId;
	}

	public void setProId(String proId) {
		this.proId = proId;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public String getProImg() {
		return proImg;
	}

	public void setProImg(String proImg) {
		this.proImg = proImg;
	}


	public int getProCount() {
		return proCount;
	}

	public void setProCount(int proCount) {
		this.proCount = proCount;
	}

	public double getProPrice() {
		return proPrice;
	}

	public void setProPrice(double proPrice) {
		this.proPrice = proPrice;
	}

	public String getProDesc() {
		return proDesc;
	}

	public void setProDesc(String proDesc) {
		this.proDesc = proDesc;
	}
	
}
