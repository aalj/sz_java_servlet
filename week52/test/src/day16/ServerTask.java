package day16;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTask {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket server = new ServerSocket(9009);
		Socket socket = server.accept();
		//得到服务器传送的值
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintStream out = new PrintStream(socket.getOutputStream());
		String message = in.readLine();
		//===========
		
		
		File file = new File("G:\\SuZhou_Android\\week52\\test\\src\\day16\\"+message);
			while((message=in.readLine())!=null){
				out.println(message);
				out.flush();
		}
		out.close();
		socket.close();
		in.close();
	}

}
