package cn.edu360.day10;

import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static final String KEY = "天王盖地虎";
	
	public static void main(String[] args) {
		
		try {
			ServerSocket ss = new ServerSocket(8888);
			while(true){
				//1.建立连接
				Socket s = ss.accept();
				//2.接收验证信息
				ObjectInputStream ois = new ObjectInputStream(s.getInputStream());
				String readObject = (String)ois.readObject();
				//获取输出流
				ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream());
				//3.返回验证信息
				if(KEY.equals(readObject)){
					oos.writeObject("宝塔镇河妖");
					oos.flush();
					
					String path = (String)ois.readObject();
					FileOutputStream fos = new FileOutputStream(path);//多层目录可能出现问题
					byte[] b = new byte[1024];
					int length = 0;
					while((length=ois.read(b))!=-1){
						fos.write(b, 0, length);
						
					}
					fos.close();
					String comd = (String)ois.readObject();
					String result = Util.runJar(comd);
					oos.writeObject(result);
					oos.flush();
				
				}else{
					oos.writeObject("宝塔镇不住河妖");
					oos.flush();
				}
				s.shutdownInput();
				s.shutdownOutput();
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
