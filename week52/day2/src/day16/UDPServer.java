/**
 * UDPServer.java
 * day2
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月22日 		liang
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
 * Function: UDP通信的服务端
 * Reason:	 TODO ADD REASON
 *
 * @author   liang
 * @version  
 * @since    Ver 1.1
 * @Date	 2015年12月22日		下午2:40:20
 *
 * @see 	 

 */
public class UDPServer {

	public static void main(String[] args) throws IOException {
		//创建一个datagramScoket对象
		DatagramSocket socket = new DatagramSocket(8090);
		//创建一个字节数组,村接收到的数据
		byte[] buff = new byte[1024];
		//创建好信封
		DatagramPacket dp =new DatagramPacket(buff, buff.length);
		//接收到的数据,放到dp中
		socket.receive(dp);
		//获得接收到的数据
		String s = new String(dp.getData(),0,dp.getData().length);
		System.out.println("接收到的数据"+s);
		socket.close();
		
	}

}

