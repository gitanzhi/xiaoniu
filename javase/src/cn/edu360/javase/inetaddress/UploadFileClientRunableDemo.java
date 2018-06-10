package cn.edu360.javase.inetaddress;

public class UploadFileClientRunableDemo {

	public static void main(String[] args) {
		
		ThreadPoolUtils.execute(new UploadFileClientRunable("192.168.31.27", 8889, "D:/java/11.jpg"));
		ThreadPoolUtils.execute(new UploadFileClientRunable("192.168.31.27", 8889, "D:/java/22.jpg"));
		ThreadPoolUtils.execute(new UploadFileClientRunable("192.168.31.27", 8889, "D:/java/33.jpg"));
	}

}
