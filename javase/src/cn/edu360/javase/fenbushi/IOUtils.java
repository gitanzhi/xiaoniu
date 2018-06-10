package cn.edu360.javase.fenbushi;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class IOUtils {
	
	public static void main(String[] args) {
		int i = 1233410;
		byte[] byteArray = intToByteArray(i);
		System.out.println(Arrays.toString(byteArray));
		
		int j = byteArrayToInt(byteArray);
		System.out.println(j);
	}
	 
	//int值转化成字节数组
	public static byte[] intToByteArray(int i) {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(baos);
		try {
			dos.writeInt(i);
			return baos.toByteArray();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	/*
	 * 字节数组转化为int值
	 */
	public static int byteArrayToInt(byte[] buf) {
		ByteArrayInputStream bais = new ByteArrayInputStream(buf);
		DataInputStream dis = new DataInputStream(bais);
		try {
			return dis.readInt();
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	//long值转化为数组
	public static byte[] longToByteArray(long l) {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(baos);
		try {
			dos.writeLong(l);
			return baos.toByteArray();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	/*
	 * 字节数组转化为long值
	 */
	public static int byteArrayToLong(byte[] buf) {
		ByteArrayInputStream bais = new ByteArrayInputStream(buf);
		DataInputStream dis = new DataInputStream(bais);
		try {
			return dis.readInt();
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}
		
}
