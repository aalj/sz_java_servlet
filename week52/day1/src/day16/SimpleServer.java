package day16;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {

	public static void main(String[] args) throws IOException {
		//��ĳ���˿��Ͻ�һ������������
		ServerSocket server = new ServerSocket(9009);
		//��������
		Socket socket = server.accept();
		//
		System.out.println("ok,������");
	}
}
