package cn.edu360.javase.inetaddress;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class UploadFileClient {

	public static void main(String[] args) throws  Exception {
		Socket s = new Socket("192.168.31.27",8888);
		BufferedOutputStream bos = new BufferedOutputStream(s.getOutputStream());
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:/java/奥黛丽赫本.jpg"));
		byte[] buf = new byte[1024];
		int len;
		while((len = bis.read(buf))!=-1) {
			bos.write(buf,0,len);
		}
		bos.flush();
		
		s.shutdownOutput();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		 
		System.out.println(br.readLine());
		bis.close();
		s.close();
	}

}
