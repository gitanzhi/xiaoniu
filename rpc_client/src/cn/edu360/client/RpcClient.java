package cn.edu360.client;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

import protocal.Request;
import protocal.Response;
import protocal.User;

public class RpcClient {
	public static void main(String[] args) {
		Request req = new Request();
		
//		req.setClassName("cn.edu360.service.impl.UserServiceImpl");
//		req.setMethod("register");
//		req.setParamTypes(new Class[] {User.class});
//		User user = new User();
//		user.setAge(18);
//		user.setEmail("1213@qq.com");
//		user.setMobile("213232323");
//		user.setName("xiaohua");
//		user.setPassword("21332");
//		user.setUserName("xiaohua");
//		req.setParamValue(new Object[] {user});
		
		req.setClassName("cn.edu360.service.impl.UserServiceImpl");
		req.setMethod("login");
		req.setParamTypes(new Class[] {String.class,String.class});
		req.setParamValue(new Object[] {"xiaohua","21332"});
		
		
		
		try {
			Socket sc = new Socket("localhost",10000);
			InputStream in = sc.getInputStream();
			OutputStream out = sc.getOutputStream();
			System.out.println("获取流");
			
			ObjectOutputStream oos = new ObjectOutputStream(out);
			oos.writeObject(req);
			System.out.println("发送请求");
			//接收结果
			ObjectInputStream ois = new ObjectInputStream(in);
			Response res = (Response)ois.readObject();
			
			System.out.println(res);
			if(res.getStatus()==0) {
				System.out.println(res.getResult());
			}else {
				throw new RuntimeException(res.getE().getMessage());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
