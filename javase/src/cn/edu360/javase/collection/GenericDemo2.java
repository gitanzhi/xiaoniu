package cn.edu360.javase.collection;
/**
 * 泛型定义在方法中
 * public  <泛型类型> 返回类型 方法名  （泛型类型）{}
 * @author Liu Ming
 * @createdTime 2018年4月29日 下午2:27:30
 */
public class GenericDemo2 {

	public static void main(String[] args) {
		Object object = "hha";
		String string = (String)object;
		
		String s1 = cast(object);
		System.out.println(s1);
	}
	
	public static <T> T cast(Object obj) {
		return (T)obj;
	}
	
}

interface  GenericInter<T>{
	T cast(Object o);
}


class GenericDemo3 implements GenericInter<String>{
	@Override
	public String cast(Object o) {
		return (String) o;
	}
}