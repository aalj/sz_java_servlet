/**
 * UDPClient.java
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

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * ClassName:UDPClient <br/>
 * Function:UDPͨ�ŵĿͻ���<br/>
 * 
 * Reason: TODO ADD REASON<br/>
 *
 * @author liang
 * @version
 * @since Ver 1.1
 * @Date 2015��12��22�� ����2:40:36
 *
 * @see
 * 
 */
public class UDPClient {

	public static void main(String[] args) throws IOException {
		
		//����һ��DatagramSocket����
		DatagramSocket socket = new DatagramSocket();
		//���͵ĵ�ַ
		InetAddress address = InetAddress.getLocalHost();
		
		//׼���ŷ�,�����е�����
		String str = "���������";
		DatagramPacket dp = new DatagramPacket(str.getBytes(),str.getBytes().length,address,8090);
		socket.send(dp);
		System.out.println("���ͳɹ�");
		socket.close();
		

	}

}
