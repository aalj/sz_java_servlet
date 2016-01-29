/**
 * Client.java
 * zuoye
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月22日 		liang
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package zuoye;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.nio.CharBuffer;
import java.util.Scanner;

/**
 * ClassName:Client Function: TODO ADD FUNCTION Reason: TODO ADD REASON
 *
 * @author liang
 * @version
 * @since Ver 1.1
 * @Date 2015年12月22日 下午4:42:05
 *
 * @see
 * 
 */
public class Client {

	public static void main(String[] args) {
		try {
			// 创建socket对象
			Socket socket = new Socket("localhost", 9009);
			new Thread(new SocketSend(socket)).start();
			new Thread(new SocketReceiver(socket)).start();

		} catch (IOException e) {

			//
			e.printStackTrace();

		}

	}

}

class SocketSend implements Runnable {
	private Socket socket = null;
	private PrintStream print = null;
	Scanner scan = new Scanner(System.in);

	public SocketSend(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		try {
			print = new PrintStream(socket.getOutputStream());
			while(true){
				String nextLine = scan.nextLine();
				
			print.println(nextLine);
			print.flush();
			}

		} catch (IOException e) {

			//
			e.printStackTrace();

		} finally {
			try {
				if (socket != null)
					socket.close();
				if (print != null)
					print.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}

		}

	}

}

class SocketReceiver implements Runnable {
	private Socket socke = null;
	private BufferedWriter bufferedWriter;
	private InputStream buffer;

	public SocketReceiver(Socket socke) {
		super();
		this.socke = socke;
	}

	@Override
	public void run() {
		try {

			File file = new File("G:\\SuZhou_Android\\week52\\day2\\src\\zuoye\\a.txt");
			bufferedWriter = new BufferedWriter(new FileWriter(file));
			
			//接收服务器的没内容
			buffer = socke.getInputStream();
			byte[] buff = new byte[1024];
			int len = 0;
			String i = null;
			while ((len = buffer.read(buff)) != -1) {
				
				bufferedWriter.write(len);
				System.out.print(new String (buff,0,len));
			}

		} catch (IOException e) {

			//
			e.printStackTrace();

		} finally {
			if (bufferedWriter != null) {
				try {
					bufferedWriter.close();
				} catch (IOException e) {
					
					//
					e.printStackTrace();
					
				}
			}
		}

	}

}
