package cn.edu360.day06;

import org.junit.Before;

public class Test {
	public static void main(String[] args) {
		System.out.println("-----main");
	}
	
	@Before
	public void testbefore(){
		System.out.println("_---before");
	}
	
	@org.junit.Test
	public void testIsSame(){
		System.out.println("aa");
	}
	
	@org.junit.Test
	public void testJunit(){
		System.out.println("------test");
		String line = "163.177.71.12 - - [18/Sep/2013:06:49:36 +0000] ";
		String dataByRegex = Demo.getDataByRegex(line, "(\\d+\\.){3}\\d+");
		if("163.177.71.12".equals(dataByRegex)){
			System.out.println("ok");
		}else{
			throw new RuntimeException("error");
		}
	}
}
