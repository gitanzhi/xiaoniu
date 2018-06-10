package cn.edu360.javase.inetaddress;

public class UDPChatRoomDemo {
	public static void main(String[] args) {
		ThreadPoolUtils.execute(new UDPChatRoomService(8888));
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ThreadPoolUtils.execute(new UDPChatRoomClient("127.0.0.1",8888));
		
	}
	
	
}
