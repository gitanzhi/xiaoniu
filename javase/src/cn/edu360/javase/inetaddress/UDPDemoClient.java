package cn.edu360.javase.inetaddress;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.net.SocketException;

/**
 * 
 * @author Liu Ming
 * @createdTime 2018年5月8日 下午3:14:19
 */
public class UDPDemoClient {

	public static void main(String[] args) throws Exception {
		DatagramSocket ds = new DatagramSocket();
		byte[] buf = "UDP,我来了".getBytes();
		int length = buf.length; 
		InetAddress address = InetAddress.getByName("127.0.0.1");
		int port = 8888;
		DatagramPacket p = new DatagramPacket(buf,length,address,port); // 构造 DatagramPacket，用来接收长度为 length 的数据包。
		ds.send(p);
		ds.close();
	}

}
