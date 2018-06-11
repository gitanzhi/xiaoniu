package cn.edu360.day09;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.net.Socket;

import cn.edu360.day09.model.Request;
import cn.edu360.day09.model.Response;
import cn.edu360.day09.model.UserResult;

public class Server {
	public static void main(String[] args) {
		
		try {
			ServerSocket ss = new ServerSocket(8888);
			while(true){
				Socket s = ss.accept();
				ObjectInputStream ois = new ObjectInputStream(s.getInputStream());
				Object readObject = ois.readObject();
				Request request = (Request)readObject;
				String className = request.getClassName();
				String methodName = request.getMethodName();
				Class[] paramType = request.getParamType();
				Object[] paramValue = request.getParamValue();
				//获取class对象
				Class clazz = Class.forName(className);
				//实例化一个对象
				Object newInstance = clazz.newInstance();
				//得到方法对象
				Method method = clazz.getMethod(methodName, paramType);
				//执行方法
				Object invoke = method.invoke(newInstance, paramValue);
				
				UserResult result = (UserResult) invoke;
				
				Response response = new Response();
				response.setStatus("200");
				response.setResult(result);
				System.out.println(response);
				ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream());
				oos.writeObject(response);
				oos.flush();
				oos.close();
				ois.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
