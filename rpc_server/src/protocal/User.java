package protocal;

import java.io.Serializable;

public class User implements Serializable{
	private String userName;
	
	private String password;
	
	private String name;
	
	private Integer age;
	
	private String email;
	
	private String mobile;

	public User(String userName, String password, String name, int age, String email, String mobile) {
		super();
		this.userName = userName;
		this.password = password;
		this.name = name;
		this.age = age;
		this.email = email;
		this.mobile = mobile;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
}
