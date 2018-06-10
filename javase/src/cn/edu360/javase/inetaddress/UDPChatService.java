package cn.edu360.javase.inetaddress;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPChatService {

	public static void main(String[] args) throws Exception {
		DatagramSocket ds = new DatagramSocket(8888);
		
		DatagramPacket dp = new DatagramPacket(new byte[1024*64], 1024*64);
		
		byte[] data ;
		int length ; 
		InetAddress address ;
		while(true) {
			ds.receive(dp);
			data = dp.getData();
			length = dp.getLength();
			address = dp.getAddress();
			String ip = address.getHostAddress();
			String hostName = address.getHostName();
			String content = new String(data, 0, length);
			System.out.println("ip="+ip+"hostname="+hostName+"content:"+content);
		}  
	}

}
