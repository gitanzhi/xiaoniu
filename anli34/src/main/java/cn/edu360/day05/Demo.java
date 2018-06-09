package cn.edu360.day05;

import java.io.IOException;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.methods.GetMethod;

public class Demo {
	public static void main(String[] args) throws Exception {
		String url = "http://www.edu360.cn";
		HttpClient client = new HttpClient();
		HttpMethod method = new GetMethod(url);
		client.executeMethod(method);
		
		String content = method.getResponseBodyAsString();
		System.out.println(content);
	}
}
