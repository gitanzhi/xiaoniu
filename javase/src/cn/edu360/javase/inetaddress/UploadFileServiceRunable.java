package cn.edu360.javase.inetaddress;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.UUID;

public class UploadFileServiceRunable implements Runnable{
	private Socket s;
	
	
	@Override
	public void run() {
		try {
			BufferedInputStream bis = new BufferedInputStream(s.getInputStream());
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:/java/"+getUUID()+".jpg"));
			
			byte[] buf = new byte[1024];
			int len;
			while((len=bis.read(buf))!=-1) {
				bos.write(buf,0,len);
			}
			bos.close();
			System.out.println("保存文件成功");
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			bw.write("文件保存成功");
			bw.newLine();
			bw.flush();
			s.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
		}
	}
	
	public UploadFileServiceRunable(Socket s) {
		super();
		this.s = s;
	}

	public static String getUUID() {
		return  UUID.randomUUID().toString().replace("-","");
	}

}
