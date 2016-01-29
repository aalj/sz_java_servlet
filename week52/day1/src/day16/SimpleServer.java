package day16;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {

	public static void main(String[] args) throws IOException {
		//在某个端口上建一个服务器对象
		ServerSocket server = new ServerSocket(9009);
		//阻塞方法
		Socket socket = server.accept();
		//
		System.out.println("ok,联上了");
	}
}
