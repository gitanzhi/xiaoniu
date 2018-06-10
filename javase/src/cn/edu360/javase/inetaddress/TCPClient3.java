package cn.edu360.javase.inetaddress;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
/**
 * 客户端键盘录入，服务器输出到控制台
 * @author Liu Ming
 * @createdTime 2018年5月9日 下午2:15:08
 */
public class TCPClient3 {
	public static void main(String[] args) throws Exception {
		Socket s = new Socket("192.168.31.27",8888);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		Scanner sc = new Scanner(System.in);
		String content;
		while(true) {
			content = sc.nextLine();
			if("88".equals(content)) {
				break;
			}
			bw.write(content);
			bw.newLine();
			bw.flush();
			
		}
		bw.close();
	}
}
