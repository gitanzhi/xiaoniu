package cn.edu360.day09.model;

import java.io.Serializable;

public class Response implements Serializable{
	
	private String status;
	
	private UserResult result;
	
	private Exception e;
	
	public Response() {
		// TODO Auto-generated constructor stub
	}

	public Response(String status, UserResult result, Exception e) {
		super();
		this.status = status;
		this.result = result;
		this.e = e;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public UserResult getResult() {
		return result;
	}

	public void setResult(UserResult result) {
		this.result = result;
	}

	public Exception getE() {
		return e;
	}

	public void setE(Exception e) {
		this.e = e;
	}

	@Override
	public String toString() {
		return "Response [status=" + status + ", result=" + result + ", e=" + e + "]";
	}
	
	
}
