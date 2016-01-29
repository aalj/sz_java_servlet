package day16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


public class SimpleClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// 联接一个服务器
		Socket socket = new Socket("localhost", 9009);
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintStream printStream = new PrintStream(socket.getOutputStream());
		//出现问题
//		String i = null;
//		while ((i = bufferedReader.readLine()) != null) {
//			System.out.println("1");
//			System.out.println(i);
//			System.out.println("2");
//		}
		
		
		System.out.println(bufferedReader.readLine());
		//发送一条消息对服务器,加循环,发送消息从键盘读入,当从键盘中输入的是quit时
		//从键盘:System.in----->InputStreamReader---->BuffereReader
		Scanner scan = new Scanner(System.in);
		while (true) {
			String mess= scan.next();
			printStream.println("客户端说:   "+mess);
			printStream.flush();
			if ("quit".equals(mess)) {
				break;
			}
			//接收服务器端的消息
			System.out.println(bufferedReader.readLine());
			
		}
		
		printStream.print("我是客户端");
		printStream.flush();
		printStream.close();
		scan.close();
		bufferedReader.close();
		socket.close();
	}

}
