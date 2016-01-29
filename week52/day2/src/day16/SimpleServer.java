package day16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {

	public static void main(String[] args) throws IOException {
		// 在某个端口上建一个服务器对象
		ServerSocket server = new ServerSocket(9009);
		// 阻塞方法
		Socket socket = server.accept();
		//
		System.out.println("ok,连上�?");
		// 发�?�一条消息给客户�?
		PrintStream printStream = new PrintStream(socket.getOutputStream());
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		printStream.println("dasong wenben ");
		printStream.flush();
		
		//接收客户端发来的消息,显示
		//加循�?,判断客户端过来的消息是quit �?�?
		while(true){
			String mess = bufferedReader.readLine();
			System.out.println(mess);
			//回�?�消息到客户�?
			printStream.println(mess);
			printStream.flush();
		
			if("quit".equals(mess)){
				break;
			}
		}
		
		
		
		
		
		
		System.out.println(bufferedReader.readLine());
		//出现问题
//		String i;
//		while ((i = bufferedReader.readLine()) != null) {
//			System.out.println(i);
//		}

		printStream.close();
		bufferedReader.close();
		socket.close();
		server.close();
	}
}
