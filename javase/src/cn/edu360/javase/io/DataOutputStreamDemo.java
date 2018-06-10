package cn.edu360.javase.io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 * 将各种数据类型
 * @author Liu Ming
 * @createdTime 2018年4月30日 下午1:11:27
 */
public class DataOutputStreamDemo {

	public static void main(String[] args) {
		try {
			DataOutputStream dos  = new DataOutputStream(new FileOutputStream("D:/java/test.txt"));
			dos.writeInt(111);
			dos.writeLong(12121);
			dos.writeUTF("老师好");
			
			
			
			dos.flush();
			dos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
