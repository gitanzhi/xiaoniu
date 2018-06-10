package cn.edu360.javase.inetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *     
     getAddress()   返回此 InetAddress 对象的原始 IP 地址。        
	 getAllByName(String host) 在给定主机名的情况下，根据系统上配置的名称服务返回其 IP 地址所组成的数组。        
	 getByAddress(byte[] addr)  在给定原始 IP 地址的情况下，返回 InetAddress 对象。 
	 getByAddress(String host, byte[] addr)  根据提供的主机名和 IP 地址创建 InetAddress。 
	 getByName(String host)  在给定主机名的情况下确定主机的 IP 地址。
	 getCanonicalHostName() 获取此 IP 地址的完全限定域名。 
	 getHostAddress()  返回 IP 地址字符串（以文本表现形式）。 
	 getHostName()  获取此 IP 地址的主机名。 
	 getLocalHost() 返回本地主机。 
	 
 * @author Liu Ming
 * @createdTime 2018年5月8日 下午2:54:42
 */
public class InetAddressDemo {
	
	public static void main(String[] args) throws Exception {

		InetAddress inetAddress = InetAddress.getByName("192.168.31.27");//计算机名或者IP字符串
		
		System.out.println(inetAddress.getHostAddress());//192.168.31.27
		
		System.out.println(inetAddress.getHostName());
		
		System.out.println(inetAddress);
		
		InetAddress localhost = InetAddress.getLocalHost();
		System.out.println(localhost);
	}

}
