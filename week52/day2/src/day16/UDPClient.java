/**
 * UDPClient.java
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
import java.net.InetAddress;

/**
 * ClassName:UDPClient <br/>
 * Function:UDP通信的客户端<br/>
 * 
 * Reason: TODO ADD REASON<br/>
 *
 * @author liang
 * @version
 * @since Ver 1.1
 * @Date 2015年12月22日 下午2:40:36
 *
 * @see
 * 
 */
public class UDPClient {

	public static void main(String[] args) throws IOException {
		
		//创建一个DatagramSocket对象
		DatagramSocket socket = new DatagramSocket();
		//发送的地址
		InetAddress address = InetAddress.getLocalHost();
		
		//准备信封,及信中的内容
		String str = "今天好心情";
		DatagramPacket dp = new DatagramPacket(str.getBytes(),str.getBytes().length,address,8090);
		socket.send(dp);
		System.out.println("发送成功");
		socket.close();
		

	}

}
