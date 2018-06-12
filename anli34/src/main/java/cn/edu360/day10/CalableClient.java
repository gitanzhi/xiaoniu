package cn.edu360.day10;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.concurrent.Callable;

public class CalableClient implements Callable<String>{
	
	static final String KEY = "天王盖地虎";
	
	String path ;
	String comd ;
	String localPath;
	String ip;
	
	public CalableClient() {
		super();
	}
	
	

	public CalableClient(String path, String comd, String localPath, String ip) {
		super();
		this.path = path;
		this.comd = comd;
		this.localPath = localPath;
		this.ip = ip;
	}



	@Override
	public String call() throws Exception {
		String ret = "";
		try {
			Socket s = new Socket(ip,8888);
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
				FileInputStream fis = new FileInputStream(localPath);
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
				ret = (String)ois.readObject();
				System.out.println(ret);
				
			}else{
				System.out.println("验证失败");
			}
			s.shutdownInput();
			s.shutdownOutput();
		}  catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return ret;
	}

}
