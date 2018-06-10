package cn.edu360.shop.pojo;

import java.io.Serializable;
import java.util.Date;


public class Order implements Serializable{
	private String orderId;//user
	private String username;
	private double amount;
	private String addr;
	private Date date;
	public Order() {
		super();
	}
	public Order(String orderId, String username, double amount, String addr, Date date) {
		super();
		this.orderId = orderId;
		this.username = username;
		this.amount = amount;
		this.addr = addr;
		this.date = date;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", username=" + username + ", amount=" + amount + ", addr=" + addr
				+ ", date=" + date + "]";
	}
	
	
}
