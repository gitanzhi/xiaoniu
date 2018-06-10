package cn.edu360.javase.fenbushi;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.InetAddress;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindWordCount {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("D:/java/wordcount.txt"));
		StringBuilder sb = new StringBuilder();
		String content;
		
		while((content = br.readLine()) != null) {
			sb.append(content + " ");
		}
		
		String input = sb.toString().trim();
		String regex = "\\b[a-zA-Z]+\\b";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(input);
		
		int count = 0;
		while(m.find()) {
			count++;
		}
		
		InetAddress localHost = InetAddress.getLocalHost();
		String ip = localHost.getHostAddress();
		String hostName = localHost.getHostName();
		System.out.println("ip="+ip+"主机名："+hostName+"单次数量:"+count);
	}

}
