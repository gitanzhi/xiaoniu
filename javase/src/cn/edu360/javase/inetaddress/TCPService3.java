package cn.edu360.javase.inetaddress;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPService3 {

	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(8888);
		Socket s = ss.accept();
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String content;
		while((content=br.readLine())!=null) {
			System.out.println(content);
		}
		s.close();
		ss.close();
	}

}
