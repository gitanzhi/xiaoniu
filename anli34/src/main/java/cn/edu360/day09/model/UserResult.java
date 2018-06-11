package cn.edu360.day09.model;

import java.io.Serializable;

public class UserResult implements Serializable{
	
	private boolean result;
	
	private String message;

	public UserResult() {
		super();
	}

	public UserResult(boolean result, String message) {
		super();
		this.result = result;
		this.message = message;
	}

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "UserResult [result=" + result + ", message=" + message + "]";
	}
	
	
}
