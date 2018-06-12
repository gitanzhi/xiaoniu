package cn.edu360.day10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static final String KEY = "天王盖地虎";
	
	public static void main(String[] args) {
		String path = "D:\\java\\data\\wc2.jar";
		String comd = "java -jar D:\\java\\data\\wc2.jar";
		try {
			Socket s = new Socket("localhost",8888);
			ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream());
			oos.writeObject(KEY);
			oos.flush();
			ObjectInputStream ois = new ObjectInputStream(s.getInputStream());
			String readObject = (String)ois.readObject();
			if("宝塔镇河妖".equals(readObject)){
				//发送jar文件位置
				oos.writeObject(path);
				oos.flush();
				
				//
				FileInputStream fis = new FileInputStream("D:\\java\\data\\wc.jar");
				byte[] b = new byte[1024];
				int length = 0;
				while((length=fis.read(b))!=-1){
					oos.write(b,0,length);
				}
				oos.flush();
				fis.close();
				//发送commond
				oos.writeObject(comd);
				oos.flush();
				
				//获取结果
				String ret = (String)ois.readObject();
				System.out.println(ret);
				
			}else{
				System.out.println("验证失败");
			}
			s.shutdownInput();
			s.shutdownOutput();
		}  catch (Exception e) {
			e.printStackTrace();
		}
	}
}
