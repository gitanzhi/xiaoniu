package cn.edu360.javase.wrapper;

/**
 *
 * @author liuming
 * @date 2018年4月15日  下午5:10:19
 */
public class WrapperDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 100;
		System.out.println(Integer.toBinaryString(i));//2进制
		System.out.println(Integer.toOctalString(i));//8
		System.out.println(Integer.toHexString(i));//16
		System.out.println(Integer.toString(i,2));//数字转为2进制的string
		System.out.println(Integer.parseInt("23",16));//字符串转为16进制的int
		
		/*
		 * isUpperCase
		 * isLowerCase
		 * isDigit
		 * toUpperCase
		 * toLowerCase
		 * Charactor 
		 */
		System.out.println(Character.isUpperCase('A'));
		
		String str1 = "JKLhHKKjhkHKJHkgk*(n^*&6788)()9090JJLLJhbjkkljl";
		char[] char1 = str1.toCharArray();
		int count1 = 0;//小写
		int count2 = 0;//大写
		int count3 = 0;//数字
		for (int j = 0; j < char1.length; j++) {
			if(Character.isLowerCase(char1[j])) {
				count1++;
			}else if(Character.isUpperCase(char1[j])) {
				count2++;
			}else if(Character.isDigit(char1[j])) {
				count3++;
			}
		}
		System.out.println("小写"+count1);
		System.out.println("大写"+count2);
		System.out.println("数字"+count3);
	}

}
