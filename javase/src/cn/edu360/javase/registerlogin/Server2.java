package cn.edu360.javase.registerlogin;

import java.net.ServerSocket;
import java.net.Socket;


public class Server2 {

	public static void main(String[] args) throws Exception {
		//
		ServerSocket ss = new ServerSocket(8888);
		
		while(true) {
			Socket s = ss.accept();
			//接收到请求链接对象，交给子线程
			ThreadPoolUtils.execute(new ServerRunable(s));
		}
	}
	
	

}
