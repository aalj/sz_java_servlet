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
 * @author Administrator 服务端：读入客户端发给服务器端的字符串，在服务器当前目录下查找以该字符串作为
 *         文件名的文件，并把该文件内容发送给客户端。 文件中内容 ==》送到网上 客户端：发送给服务器端一个字符串filename
 *         表示服务器上的一个文件，然后从服务器 端读入文件内容，并起名叫server_filename 保存在当前目录。 网上接收到的数据
 *         ==》存到文件中 例如，假设服务器当前目录下有个myphoto.jpg 文件，则客户端发送字符串“myphoto.jpg”
 *         给服务器端，然后从服务器端读入myphoto.jpg 文件的内容，并起名为server_myphoto.jpg 保存在客户端当前目录下
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
