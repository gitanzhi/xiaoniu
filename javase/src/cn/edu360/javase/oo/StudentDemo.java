package cn.edu360.javase.oo;

public class StudentDemo {

	public static void main(String[] args) {
		Student t;
		//System.out.println(t);
		t = new Student();
		System.out.println(t.name);//null
		System.out.println(t.stuId);//null
		System.out.println(t.sex);//'男'
		t.name = "小明";
		
		Student t2 = new Student();
		
		t2 = t;//其实是指向堆中的地址 
		System.out.println(t2.name);//小明
		
		t2.stuId = "123";
		System.out.println(t.stuId);//123
	}

}
