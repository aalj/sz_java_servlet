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
		// ����һ��������
		Socket socket = new Socket("localhost", 9009);
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintStream printStream = new PrintStream(socket.getOutputStream());
		//��������
//		String i = null;
//		while ((i = bufferedReader.readLine()) != null) {
//			System.out.println("1");
//			System.out.println(i);
//			System.out.println("2");
//		}
		
		
		System.out.println(bufferedReader.readLine());
		//����һ����Ϣ�Է�����,��ѭ��,������Ϣ�Ӽ��̶���,���Ӽ������������quitʱ
		//�Ӽ���:System.in----->InputStreamReader---->BuffereReader
		Scanner scan = new Scanner(System.in);
		while (true) {
			String mess= scan.next();
			printStream.println("�ͻ���˵:   "+mess);
			printStream.flush();
			if ("quit".equals(mess)) {
				break;
			}
			//���շ������˵���Ϣ
			System.out.println(bufferedReader.readLine());
			
		}
		
		printStream.print("���ǿͻ���");
		printStream.flush();
		printStream.close();
		scan.close();
		bufferedReader.close();
		socket.close();
	}

}
