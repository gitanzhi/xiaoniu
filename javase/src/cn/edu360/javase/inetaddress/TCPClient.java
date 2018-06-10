package cn.edu360.javase.inetaddress;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.Buffer;

public class TCPClient {

	public static void main(String[] args) throws Exception {
		Socket s = new  Socket("127.0.0.1",8888);
		OutputStream out = s.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(out);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("tcp,我来了");
		bw.newLine();
		bw.flush();
		
		s.close();
	}

}
