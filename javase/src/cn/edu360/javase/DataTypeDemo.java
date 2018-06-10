package cn.edu360.javase;
/**
 * 数据类型
 * 1、基本数据类型 byte(1) short(2) int(4) long(8) char float(4) double(8) boolean
 * 2、引用数据类型
 * 默认转化：byte,short,char --int--long--float--double
 * byte,short,char 之间相互不转化
 * @author Liu Ming
 * @createdTime 2018年4月9日 下午7:38:00
 */
public class DataTypeDemo {
	
	public static void main(String[] args) {
		byte b = 12;
		//byte b1 = 129;//cannot convert from int to byte 
		short s = 123;
		int i = 9999;
		//long l = 9099999222222;//The literal 9099999222222 of type int is out of range 默认int 
		long l = 9099999222222l;//加个l末尾
		//float f = 12.3;//cannot convert from double to float 默认是8字节double
		float f = 12.3f; //加个f
		double d = 123.443;
		char c = '中';
		char c1 = 'a';
		boolean bo = true;
		String str = "Hello";
		
		byte byte1 = 11;
		int int1 = 9;
		System.out.println(byte1+int1);//可以
		byte byte2 = (byte) (byte1+int1);//cannot convert from int to byte  需强制转化
		
		byte byte3  = 3;
		byte byte4 = 93;
		byte byte5 = (byte) (byte4+byte3);//cannot convert from int to byte int给byte有损失
	}

}
