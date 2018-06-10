package cn.edu360.javase.inetaddress;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class UDPChatRoomClient implements Runnable{
	
	private String ip;
	private int port;
	
	public UDPChatRoomClient(String ip, int port) {
		super();
		this.ip = ip;
		this.port = port;
	}

	@Override
	public void run() {
		try {
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
				dp =  new DatagramPacket(buf, buf.length, InetAddress.getByName(ip),port);
				ds.send(dp);
			}
			ds.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
