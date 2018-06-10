package cn.edu360.javase.inetaddress;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPDemoService {

	public static void main(String[] args) throws Exception {
		DatagramSocket ds = new DatagramSocket(8888);
		DatagramPacket p = new DatagramPacket(new byte[1024*64], 1024*64);
		ds.receive(p);
		byte[] data = p.getData();
		int length = p.getLength();
		InetAddress address = p.getAddress();
		String hostAddress = address.getHostAddress();
		String string = new String(data,0,length);
		System.out.println("ip"+hostAddress+",content:"+string);
		//ds.close();
		
	}

}
