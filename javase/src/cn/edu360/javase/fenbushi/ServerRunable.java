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
import java.io.UnsupportedEncodingException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerRunable implements Runnable {
	
	private static final String REQUESTHEAD = "&**@**asdkjansdn*&*@";
	
	private Socket s;
	
	public ServerRunable(Socket s) {
		super();
		this.s = s;
	}

	@Override
	public void run() {
		try {
			//读取的都是字节数据，输出的是字符数据
			BufferedInputStream bis = new BufferedInputStream(s.getInputStream());
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			String  requestHead = readFourByteToString(bis);
			
//		校验
			if(requestHead.equals(REQUESTHEAD)) {
				System.out.println("客户端身份通过");
				bw.write("1");
				bw.newLine();
				bw.flush();
				//读取保存jar的路径
				String SaveJarPath = readFourByteToString(bis);
				System.out.println(SaveJarPath);
				
				//保存jar包到指定的路径中
				String result = saveJarFile(bis,SaveJarPath);
				if("1".equals(result)) {
					System.out.println("保存jar 成功");
					bw.write("1");
					bw.newLine();
					bw.flush();
					
					//8.获取执行jar包的命令并执行
					String command = readFourByteToString(bis);
					Runtime runtime = Runtime.getRuntime();
					Process process = runtime.exec(command);
					InputStream in = process.getInputStream();
					BufferedReader br = new BufferedReader(new InputStreamReader(in, "gbk"));
					result = br.readLine();
					System.out.println(result);
					
					bw.write(result);
					bw.newLine();
					bw.flush();
					
				}else {
					System.out.println("保存jar失败");
					bw.write("2");
					bw.newLine();
					bw.flush();
				}
			}else {
				System.out.println("客户端验证失败");
				bw.write("2");
				bw.newLine();
				bw.flush();
			}
		}  catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private  String saveJarFile(BufferedInputStream bis, String saveJarPath) {
		//读取8个字节
		byte[] buf = new byte[8];
		try(BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(saveJarPath) )) {
			bis.read(buf);
			long len = IOUtils.byteArrayToLong(buf);
			//读取len字节的数据
			buf = new byte[(int) len];
			bis.read(buf);
			//将buf中的字节写出到指定路径
			
			bos.write(buf);
			return "1";
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "2";
		}
		
	}

	/**
	 * 读取四个字节所表示的字符串
	 * @param bis
	 * @return 
	 * @throws IOException
	 */
	public  String readFourByteToString(BufferedInputStream bis) throws IOException {
		//读取请求头,首先读取4个
		byte[] buf = new byte[4];
		bis.read(buf);
		//将4个字节转换成int值
		int len = IOUtils.byteArrayToInt(buf);
		//然后在读取len个字节
		buf = new byte[len];
		bis.read(buf);
		//将buf转换成字符串
		String result = new String(buf);
		return result;
	}

}
