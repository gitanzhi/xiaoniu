package cn.edu360;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import cn.edu360.day09.model.Request;
import cn.edu360.day09.model.Response;
import cn.edu360.day09.model.User;

public class Client {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("192.168.1.101",8888);
			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
			Request request = new Request();
			request.setClassName("cn.edu360.day09.service.impl.UserServiceImpl");
			request.setMethodName("login");
			request.setParamType(new Class[]{User.class});
			request.setParamValue(new Object[]{new User("mingming", "123456", "明明")});
			oos.writeObject(request);
			oos.flush();
			
			ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
			Object readObject = ois.readObject();
			Response response = (Response) readObject;
			System.out.println(response);
			socket.shutdownInput();
			socket.shutdownOutput();
			//ois.close();
			//oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
