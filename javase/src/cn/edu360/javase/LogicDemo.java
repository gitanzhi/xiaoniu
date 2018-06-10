package cn.edu360.javase;
/**
 * 逻辑运算符
 * @author Liu Ming
 * @createdTime 2018年4月9日 下午8:41:41
 */
public class LogicDemo {

	public static void main(String[] args) {
		int x =3;int y = 4;
		
		System.out.println((x++ >3) & (y++)>4);//false，都参与运算
		System.out.println(x);//4
		System.out.println(y);//5
		
		x=3;y=4;
		System.out.println((x++ >3) && (y++)>4);//false 前边为false,后边不运算
		System.out.println(x);//4
		System.out.println(y);//4
		
		x=3;y=4;
		System.out.println((++x >3) | (++y)>4);//true 都参与运算
		System.out.println(x);//4
		System.out.println(y);//5
		
		x=3;y=4;
		System.out.println((++x >3) || (++y)>4);//true 前边运算，后边不在运算
		System.out.println(x);//4
		System.out.println(y);//4
		
		//二进制运算
		System.out.println(3&5);
		System.out.println(3|5);
		System.out.println(3^5);
	}

}
