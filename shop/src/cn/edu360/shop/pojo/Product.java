package cn.edu360.shop.pojo;

import java.io.Serializable;

/*
 * 封装商品
 */
public class Product implements Serializable{
	
	private String pId;
	
	private String pName;
	
	private Double price;
	
	private String categories;
	
	private Integer stock;
	
	private boolean onShelf;
	
	public Product() {
		super();
	}
 
	public Product(String pId, String pName, double price, String categories, int stock,boolean onShelf) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.price = price;
		this.categories = categories;
		this.stock = stock;
		this.onShelf = onShelf;
	}

	public String getpId() {
		return pId;
	}

	public void setpId(String pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategories() {
		return categories;
	}

	public void setCategories(String categories) {
		this.categories = categories;
	}

	public boolean isOnShelf() {
		return onShelf;
	}

	public void setOnShelf(boolean onShelf) {
		this.onShelf = onShelf;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", price=" + price + ", categories=" + categories
				+ ", stock=" + stock + ", onShelf=" + onShelf + "]";
	}

	
}
