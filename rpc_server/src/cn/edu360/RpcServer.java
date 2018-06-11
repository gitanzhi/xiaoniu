package cn.edu360;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.net.Socket;

import protocal.Request;
import protocal.Response;
import protocal.Result;


public class RpcServer {
	public static void main(String[] args) {
		Response res = new Response();
		try {
			ServerSocket ss = new ServerSocket(10000);
			System.out.println("服务器启动，绑定端口10000");
			while(true) {
				Socket s = ss.accept();
				InputStream in = s.getInputStream();
				OutputStream out = s.getOutputStream();
				
				
				ObjectInputStream ois = new ObjectInputStream(in);
				Request req  =(Request) ois.readObject();
				System.out.println("收到请求"+req);
				
				//开始调用 ，使用反射
				String className = req.getClassName();
				Class clazz = Class.forName(className);
				Object obj = clazz.newInstance();
				
				Result result;
				try {
					Method m = clazz.getDeclaredMethod(req.getMethod(), req.getParamTypes());
					result = (Result)m.invoke(obj, req.getParamValue());
					res.setStatus(0);
					res.setResult(result);  
				} catch (Exception e) {
					res.setStatus(-1);
					res.setE(e);
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			
				ObjectOutputStream oos = new ObjectOutputStream(out);
				oos.writeObject(res);
				
				
				oos.close();
				out.close();
				ois.close();
				in.close();
				s.close();
			}
			
			
			
			
		} catch (Exception e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
