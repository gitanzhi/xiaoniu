package cn.edu360.javase.io;

import java.io.Serializable;

public class Person implements Serializable{
	private  String name;
	
	private int age;
	
	private char sex;
	
	
	public Person()   {
		
	}
	
	public Person(String name, int age, char sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
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

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + sex;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sex != other.sex)
			return false;
		return true;
	}
	
	

//	@Override
//	public int compareTo(Person o) {
//		//this和o比较是升序
//		//o和this比较是降序
//		//return this.age - o.getAge();
//		
//		//排序以姓名为主，姓名相同，按年龄
//		return this.name.equals(o.getName())?this.age-o.getAge():this.name.compareTo(o.getName());
//	}
	
	
	@Override
	public String toString() {
		return "[name"+name+",age"+age+",sex"+sex+"]";
	}
	
	
}
