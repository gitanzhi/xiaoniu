package cn.edu360.javase.excep;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		try {
			int i = 1/0;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());// / by zero
			System.out.println(e.toString());//java.lang.ArithmeticException: / by zero
			
			//写到文件中
			try {
				PrintWriter pWriter = new PrintWriter(new File("D:/java/error.txt"));
				e.printStackTrace(pWriter);
				pWriter.close();
			} catch (FileNotFoundException e1) {				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

}
