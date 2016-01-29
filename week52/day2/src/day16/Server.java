/**
 * Server.java
 * day2
 *
 * Function�� TODO 
 *
 *   ver     date      		author
 * ��������������������������������������������������������������������
 *   		 2015��12��22�� 		liang
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
 * @Date 2015��12��22�� ����8:33:48
 *
 * @see
 * 
 */
public class Server {

	public static void main(String[] args) throws IOException {
		//����û��ļ���
		List<Socket> clientList = Collections.synchronizedList(new ArrayList<>());
		// ��ĳ���˿��Ͻ�һ������������
		ServerSocket server = new ServerSocket(9009);
		// ��������
		// ��һ���ͻ������ӣ�����һ���̷߳�������ͻ�
		while (true) {
			Socket socket = server.accept();
			clientList.add(socket);
			new Thread(new ServerThread(socket)).start();
		}
	}

}

// ����һ���߳� ,�ͻ��˷���
class ServerThread implements Runnable {
	// socket:��ʾ�����ӵĿͻ���
	Socket socket = null;

	public ServerThread(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {

		try {
			//
			System.out.println("ok,������");
			// ����һ����Ϣ���ͻ���
			PrintStream printStream = new PrintStream(socket.getOutputStream());
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			printStream.println("dasong wenben ");
			printStream.flush();

			// ���տͻ��˷�������Ϣ,��ʾ
			// ��ѭ��,�жϿͻ��˹�������Ϣ��quit �˳�
			while (true) {
				String mess = bufferedReader.readLine();
				System.out.println(mess);
				// ������Ϣ���ͻ���
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
		// ��������
		// String i;
		// while ((i = bufferedReader.readLine()) != null) {
		// System.out.println(i);
		// }

	}

}