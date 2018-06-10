package cn.edu360.javase.inetaddress;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPService {

	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(8888);
		
		Socket s = ss.accept();//阻塞式的，接受不到客户端的链接，不会执行后续
		
		InputStream in = s.getInputStream();
		
		InputStreamReader isr = new  InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		
		String result = br.readLine();
		System.out.println(result);
		s.close();
		ss.close();
	}

}
