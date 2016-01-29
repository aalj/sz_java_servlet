/**
 * Client.java
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
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * ClassName:Client Function: TODO ADD FUNCTION Reason: TODO ADD REASON
 *
 * @author liang
 * @version
 * @since Ver 1.1
 * @Date 2015��12��22�� ����11:16:05
 *
 * @see
 * 
 */
public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		// ���������߳�,һ������������
		// һ�������������
		Socket scoket = new Socket("localhost", 9009);
	new	Thread(new ClientSend(scoket)).start();
	new	Thread(new ClientReceiver(scoket)).start();
	
	}

}

class ClientSend implements Runnable {
	Socket socket;

	// ͨ�����캯������Socket����
	public ClientSend(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		PrintStream out = null;
		Scanner scan = new Scanner(System.in);
		try {
			out = new PrintStream(socket.getOutputStream());
			// ѭ��.�Ӽ��̶���
			while (true) {
				String mess = scan.nextLine();

				out.println(mess);
				out.flush();
				if ("quit".equals(mess)) {
					break;
				}

				
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if (out != null) {
				out.close();
				scan.close();
			}
		}
	}

}

class ClientReceiver implements Runnable {
	Socket socket;

	public ClientReceiver(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		BufferedReader in = null;
		try {
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while (true) {
				System.out.println(in.readLine());

			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if (in != null) {

					in.close();
				} 
			} catch (Exception e2) {
				// TODO: handle exception
			}

		}
	}

}
