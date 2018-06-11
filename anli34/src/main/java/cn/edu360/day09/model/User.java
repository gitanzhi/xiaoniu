package cn.edu360.day09.model;

import java.io.Serializable;

public class User implements Serializable{
	
	private String userName;
	
	private String passWord;
	
	private String nickName;
	
	public User(String userName, String passWord, String nickName) {
		super();
		this.userName = userName;
		this.passWord = passWord;
		this.nickName = nickName;
	}

	public User() {
		super();
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", passWord=" + passWord + ", nickName=" + nickName + "]";
	}
	
}
