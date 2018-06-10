package cn.edu360.javase.inetaddress;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadFileServiceRunableDemo {

	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(8889);
		while(true) {
			Socket s = ss.accept();
			ThreadPoolUtils.execute(new UploadFileServiceRunable(s));
		}
	}

}
