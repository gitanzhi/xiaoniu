package cn.edu360.javase.registerlogin;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client2 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("请输入1代表注册，2代表登陆,其他任意字符退出");
			if(sc.hasNextInt()) {
				String i = sc.nextLine();
				if(i.equals("1")) {
					//注册
					registerAndLogin(sc,"注册","0");
				}else if (i.equals("2")) {
					//登陆
					registerAndLogin(sc,"登陆","1");
				}else {
					break;
				}
			}else {
				break;
			}
		}
	}
	

	private static void  registerAndLogin(Scanner sc,String name, String status) throws Exception {
		System.out.println("请输入要"+name+"的用户名");
		String username = sc.nextLine();
		System.out.println("请输入要"+name+"的密码");
		String password = sc.nextLine();
		
		//创建Socket对象
		Socket s = new Socket("192.168.31.27",8888);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		bw.write(status);
		bw.newLine();
		bw.write(username);
		bw.newLine();
		bw.write(password);
		bw.newLine();
		bw.flush();
		
		
		
		System.out.println("返回结果");
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		System.out.println(br.readLine());
		
		s.close();
		
	}

}
