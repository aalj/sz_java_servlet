/**
 * UDPServer.java
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
import java.net.SocketException;

/**
 * ClassName:UDPServer
 * Function: UDPͨ�ŵķ����
 * Reason:	 TODO ADD REASON
 *
 * @author   liang
 * @version  
 * @since    Ver 1.1
 * @Date	 2015��12��22��		����2:40:20
 *
 * @see 	 

 */
public class UDPServer {

	public static void main(String[] args) throws IOException {
		//����һ��datagramScoket����
		DatagramSocket socket = new DatagramSocket(8090);
		//����һ���ֽ�����,����յ�������
		byte[] buff = new byte[1024];
		//�������ŷ�
		DatagramPacket dp =new DatagramPacket(buff, buff.length);
		//���յ�������,�ŵ�dp��
		socket.receive(dp);
		//��ý��յ�������
		String s = new String(dp.getData(),0,dp.getData().length);
		System.out.println("���յ�������"+s);
		socket.close();
		
	}

}

