package cn.edu360.javase.inetaddress;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class UDPChatClient {

	public static void main(String[] args) throws Exception {
		DatagramSocket ds = new DatagramSocket();
		
		Scanner sc = new Scanner(System.in);
		
		String content;
		DatagramPacket dp;
		byte[] buf;
		
		while(true) {
			content = sc.nextLine();
			if("88".equals(content)) {
				break;
			}
			
			buf = content.getBytes();
			dp =  new DatagramPacket(buf, buf.length, InetAddress.getByName("127.0.0.1"),8888);
			ds.send(dp);
		}
		ds.close();
		
	}

}
