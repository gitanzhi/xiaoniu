package cn.edu360.javase.inetaddress;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPChatRoomService implements Runnable {
	private int port;

	@Override
	public void run() {
		try {
			DatagramSocket ds = new DatagramSocket(port);
			
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
			
		}  catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}

	public UDPChatRoomService(int port) {
		super();
		this.port = port;
	}

}
