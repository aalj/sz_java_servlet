package day16;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * @author Administrator ����ˣ�����ͻ��˷����������˵��ַ������ڷ�������ǰĿ¼�²����Ը��ַ�����Ϊ
 *         �ļ������ļ������Ѹ��ļ����ݷ��͸��ͻ��ˡ� �ļ������� ==���͵����� �ͻ��ˣ����͸���������һ���ַ���filename
 *         ��ʾ�������ϵ�һ���ļ���Ȼ��ӷ����� �˶����ļ����ݣ���������server_filename �����ڵ�ǰĿ¼�� ���Ͻ��յ�������
 *         ==���浽�ļ��� ���磬�����������ǰĿ¼���и�myphoto.jpg �ļ�����ͻ��˷����ַ�����myphoto.jpg��
 *         ���������ˣ�Ȼ��ӷ������˶���myphoto.jpg �ļ������ݣ�������Ϊserver_myphoto.jpg �����ڿͻ��˵�ǰĿ¼��
 */
public class ClientTask {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket socket = new Socket("localhost", 9009);
		PrintStream out = new PrintStream(socket.getOutputStream());
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		Scanner scanner = new Scanner(System.in);
		String filename = scanner.nextLine();
		out.println(filename);

		out.flush();

		FileWriter fw = new FileWriter("G:\\SuZhou_Android\\week52\\test\\src\\day16\\Server_long1.txt");
		String s = null;
		while ((s = in.readLine()) != null) {
			fw.write(s);
		}
		fw.flush();
		fw.close();
		out.close();
		socket.close();
	}

}
