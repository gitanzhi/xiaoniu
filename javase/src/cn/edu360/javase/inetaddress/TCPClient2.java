package cn.edu360.javase.inetaddress;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class TCPClient2 {
	public static void main(String[] args) throws Exception {
		Socket s = new Socket("192.168.31.27",8888);
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		bw.write("在啊，借点钱");
		bw.newLine();
		bw.flush();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		System.out.println(br.readLine());
		
		 s.close();
	}
}
