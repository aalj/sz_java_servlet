package day16;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class SimpleClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		//联接一个服务器
		Socket  socket = new Socket("localhost",9009);

	}

}
