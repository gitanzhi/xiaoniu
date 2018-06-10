package cn.edu360.javase.tomcat;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

import sun.reflect.generics.tree.Tree;

public class TomcatService {

	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(8886);
		while(true) {
			Socket s = ss.accept();
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			String path = br.readLine().split(" ")[1];
			String resourcePath= "webapps"+path;
			
			BufferedOutputStream bos = new BufferedOutputStream(s.getOutputStream());
			bos.write("HTTP/1.1 200 ok \r\n\r\n".getBytes());
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(resourcePath));
			byte[] buf = new byte[1024];
			int len;
			while((len=bis.read(buf))!=-1) {
				bos.write(buf, 0, len);
			}
			bos.flush();
			bis.close();
			s.close();
		}
	}

}
