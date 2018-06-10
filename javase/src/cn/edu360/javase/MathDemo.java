package cn.edu360.javase;

public class MathDemo {

	public static void main(String[] args) {
		int a=10;
		int b=4;
		System.out.println(a+b);//14
		System.out.println(a-b);//6
		System.out.println(a*b);//40
		System.out.println(a/b);//2
		System.out.println(a*1.0/b);//2.5 
		System.out.println(a/b*1.0);//2.0
		System.out.println(a%b);//2
		
		a = 10;b=10;
		a++;
		++b;
		System.out.println(a);//11
		System.out.println(b);//11
		
		int c = a++;
		int d = ++b;
		System.out.println(c);//11 
		System.out.println(d);//12
		
		
		int e = 10;int f = 10; int g = 10;
		e = f++; //e=10 f=11
		g = --e; //g = 9 e=9
		f = ++e;//f = 10 e=10
		e = g--;//e = 9 g = 8
		System.out.println(e);//9
		System.out.println(f);//10
		System.out.println(g);//8
		
		
	}

}
