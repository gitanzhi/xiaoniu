package cn.edu360.javase.fenbushi;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server2 {
	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(8888);
		//接受客户端请求
		while(true) {
			Socket s = ss.accept();
			 ThreadPoolUtils.execute(new ServerRunable(s));
		}
	
	}

	
}
