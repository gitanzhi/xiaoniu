package cn.edu360.javase.registerlogin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;


public class Server {

	public static void main(String[] args) throws Exception {
		//
		ServerSocket ss = new ServerSocket(8888);
		
		while(true) {
			Socket s = ss.accept();
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			String status = br.readLine();
			String username = br.readLine();
			String password = br.readLine();
			String result = null;
			
			switch (status) {
				case "0":
					result = dealregister(username,password);
					break;
				case "1":
					result = deallogin(username,password);
					break;
				default:
					result = "非法的请求";
					break;
			}
			System.out.println(result);
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			bw.write(result);
			bw.newLine();
			bw.flush();
			s.close();
		}
	}
	
	private static String deallogin(String username, String password) {
		//判断保存密码的文件存在不存在
		File file = new File("D:/java/user.txt");
		
		if(file.exists()) {
			Properties p = new Properties();
			try(Reader reader = new FileReader(file)) {
				p.load(reader);
				String value = p.getProperty(username);
				if(null==value) {
					return "账户未注册";
				}else if (value.equals(password)) {
					return "成功登陆，3秒跳转";
				}else {
					return "密码错误";
				}
			} catch (Exception e) {
				e.printStackTrace();
				return "服务器异常，请稍后再试";
			}
		}else {
			return "账户还没有注册";
		}
	}

	public static String dealregister(String username,String password) {
		File file = new File("D:/java/user.txt");
		Properties p = new Properties();
		if(file.exists()) {		
			try(Reader reader = new FileReader(file)) {
				p.load(reader);
				String value = p.getProperty(username);
				if(null!=value) {
					return "账户已被注册";
				}else {
					//可以注册
					return register(username, password, file, p);
				}
			} catch (Exception e) {
				e.printStackTrace();
				return "服务器异常";
			}
		}else {//文件都不存在，可以直接注册
			return register(username, password, file, p);
			 
		}
	}

	public static String register(String username, String password, File file, Properties p) {
		p.setProperty(username, password);
		try(Writer writer = new FileWriter(file)) {
			p.store(writer,null);
			return "注册成功";
		} catch (IOException e) {
			
			e.printStackTrace();
			return "服务器异常，请稍后再试";
		}
	}

}
