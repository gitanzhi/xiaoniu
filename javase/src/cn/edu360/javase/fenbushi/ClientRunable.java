package cn.edu360.javase.fenbushi;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientRunable implements Runnable{
	private static final String REQUESTHEAD = "&**@**asdkjansdn*&*@";
	private String ip = "192.168.31.27";
	private int port = 8888;
	
	public ClientRunable(String ip, int port) {
		super();
		this.ip = ip;
		this.port = port;
	}
	
	@Override
	public void run() {
		//新建socket对象并指定ip和端口
		try(Socket s = new Socket(ip,port)) {
			//因为输出的是字节，读取的是字符串
			BufferedOutputStream bos = new BufferedOutputStream(s.getOutputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			//将请求头写出去
			writeRequestHeader(bos);
			
			//读取服务端
			String result = br.readLine();
			if("1".equals(result)) {
				System.out.println("身份验证通过");
				//5.将保存jar包的路径写出去
				writeSaveJarPath(bos);
				
				//6.将jar包文件写出到服务端
				writeJarFile(bos);
				result = br.readLine();
				if("1".equals(result)) {
					System.out.println("上传jar成功");
					
					//将执行jar包的命令写出到服务端
					writeCommand(bos);
					System.out.println(br.readLine());
				}else {
					System.out.println("上传失败");
				}
			}else {
				System.out.println("身份验证失败");
			}
			s.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

	private void writeCommand(BufferedOutputStream bos) throws Exception {
		String command = "java -jar D:/java/wordcount.jar";
		byte[] bytes = command.getBytes();
		bos.write(IOUtils.intToByteArray(bytes.length));
		//将执行jar包的命令以字节数组方式写出
		bos.write(bytes);
		bos.flush();
	}

	private void writeJarFile(BufferedOutputStream bos) throws Exception {
		File file = new File("D:/java/wordcount.jar");
		//将jar包的长度写出到服务端
		bos.write(IOUtils.longToByteArray(file.length()));
		//循环的将jar发送到服务端
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		byte[] buf = new byte[1024];
		int len;
		while((len=bis.read(buf))!=-1) {
			bos.write(buf,0,len);
		}
		bis.close();
		bos.flush();
	}

	private void writeSaveJarPath(BufferedOutputStream bos) throws Exception {
		String jarPath = "D:/java/wordcount.jar";
		//保存jar包的路径所占的字节大小写出
		byte[] bytes = jarPath.getBytes();
		int length = bytes.length;
		bos.write(IOUtils.intToByteArray(length));
		bos.write(bytes);
		bos.flush();
	}

	private void writeRequestHeader(BufferedOutputStream bos) throws Exception {
		//将请求头所占的字节大小写出去
		byte[] bytes = REQUESTHEAD.getBytes();
		int length = bytes.length;
		bos.write(IOUtils.intToByteArray(length));
		bos.write(bytes);
		bos.flush();
	}

}
  