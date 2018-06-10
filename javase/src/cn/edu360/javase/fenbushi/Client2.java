package cn.edu360.javase.fenbushi;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client2 {
	
	public static void main(String[] args) throws Exception {
		ThreadPoolUtils.execute(new ClientRunable("192.168.31.27", 8888));
	}

	
}
