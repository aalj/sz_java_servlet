/**
 * Server.java
 * day2
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月22日 		liang
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package day16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ClassName:Server Function: TODO ADD FUNCTION Reason: TODO ADD REASON
 *
 * @author liang
 * @version
 * @since Ver 1.1
 * @Date 2015年12月22日 上午8:33:48
 *
 * @see
 * 
 */
public class Server {

	public static void main(String[] args) throws IOException {
		//存放用户的集合
		List<Socket> clientList = Collections.synchronizedList(new ArrayList<>());
		// 在某个端口上建一个服务器对象
		ServerSocket server = new ServerSocket(9009);
		// 阻塞方法
		// 有一个客户端连接，创建一个线程服务这个客户
		while (true) {
			Socket socket = server.accept();
			clientList.add(socket);
			new Thread(new ServerThread(socket)).start();
		}
	}

}

// 创建一个线程 ,客户端服务
class ServerThread implements Runnable {
	// socket:表示所连接的客户端
	Socket socket = null;

	public ServerThread(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {

		try {
			//
			System.out.println("ok,连上了");
			// 发送一条消息给客户端
			PrintStream printStream = new PrintStream(socket.getOutputStream());
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			printStream.println("dasong wenben ");
			printStream.flush();

			// 接收客户端发来的消息,显示
			// 加循环,判断客户端过来的消息是quit 退出
			while (true) {
				String mess = bufferedReader.readLine();
				System.out.println(mess);
				// 回送消息到客户端
				printStream.println(mess);
				printStream.flush();

				if ("quit".equals(mess)) {
					break;
				}
			}
			printStream.close();
			bufferedReader.close();
			socket.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

		// System.out.println(bufferedReader.readLine());
		// 出现问题
		// String i;
		// while ((i = bufferedReader.readLine()) != null) {
		// System.out.println(i);
		// }

	}

}