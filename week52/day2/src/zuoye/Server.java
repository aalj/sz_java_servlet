/**
 * Server.java
 * zuoye
 *
 * Function�� TODO 
 *
 *   ver     date      		author
 * ��������������������������������������������������������������������
 *   		 2015��12��22�� 		liang
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package zuoye;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ClassName:Server
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   liang
 * @version  
 * @since    Ver 1.1
 * @Date	 2015��12��22��		����4:41:52
 *
 * @see 	 

 */
public class Server {

	public static void main(String[] args) {
		try {
			//����Socket����˶���
			ServerSocket serverSocket = new ServerSocket(9009);
			//�ȴ��������
			Socket accept = serverSocket.accept();
			System.out.println("lainjieshang");
			//���տͻ��˷�������Ϣ
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(accept.getInputStream()));
			String s= bufferedReader.readLine();
			//������������ڰ��ļ�����Ȼ���͵��ͻ���
			File file = new File("G:\\SuZhou_Android\\week52\\day2\\src\\zuoye\\"+s);
			//���ڶȵ�ǰ���ļ���
			FileInputStream reader = new FileInputStream(file);
			byte[] buff = new byte[1024*1024];
			int len =0;
			
			PrintStream printStream = new PrintStream(accept.getOutputStream());
			
			while((len=reader.read(buff) )!=-1){
				printStream.println(buff);
				printStream.flush();
				
			}
			printStream.close();
			reader.close();
		} catch (IOException e) {
			
			//
			e.printStackTrace();
			
		}finally{
			
		}

	}

}

