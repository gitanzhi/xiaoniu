package cn.edu360.javase.inetaddress;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class UploadFileClientRunable implements Runnable {
	private String ip ;
	private int port;
	private String uploadFile;
	@Override
	public void run() {
		Socket s = null;
		BufferedInputStream bis = null;
		try {
			s = new Socket(ip,port);
			BufferedOutputStream bos = new BufferedOutputStream(s.getOutputStream());
			bis = new BufferedInputStream(new FileInputStream(uploadFile));
			byte[] buf = new byte[1024];
			int len;
			while((len = bis.read(buf))!=-1) {
				bos.write(buf,0,len);
			}
			bos.flush();
			
			s.shutdownOutput();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			 
			System.out.println(br.readLine());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(null!=bis) {
				try {
					bis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			if (null!=s) {
				try {
					s.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}
	public UploadFileClientRunable(String ip, int port, String uploadFile) {
		super();
		this.ip = ip;
		this.port = port;
		this.uploadFile = uploadFile;
	}

}
