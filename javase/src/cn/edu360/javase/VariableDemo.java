package cn.edu360.javase;
/***
 * 变量
 * 数据类型 变量名 = 初始化值
 * @author Liu Ming
 * @createdTime 2018年4月9日 下午7:25:01
 */
public class VariableDemo {

	public static void main(String[] args) {
		int var = 12;
		System.out.println(var); //12
		
		var  = 15;
		System.out.println(var);//15
		
/*		int var = 18;  //同一个变量不能声明2次
		System.out.println(var);*/
		
		int a;
		a = 10;
		System.out.println(a);//变量声明后在使用
	}

}
