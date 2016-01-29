/**
 * Net.java
 * day16.net
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月21日 		liang
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package day16.net;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * ClassName:Net
 * Function: 网络编程
 * Reason:	 TODO ADD REASON
 *
 * @author   liang
 * @version  
 * @since    Ver 1.1
 * @Date	 2015年12月21日		下午3:11:02
 *
 * @see 	 

 */
public class InterAddressDemo {

	public static void main(String[] args) throws IOException {
		//说明InterAddreaa的用法
		//通过InetAddress的静态方法byName,获得其实例
		InetAddress address = InetAddress.getByName("www.baidu.com");
		System.out.println(address.getHostAddress());			//IP地址
		System.out.println(address.getHostName() ); 			//域名	
		//测试是否可达
		System.out.println(address.isReachable(1000));
		//得到本地的InetAddress实例
		InetAddress address2 = InetAddress.getLocalHost();
		System.out.println(address2.getHostAddress()); 			//
		System.out.println(address2.getHostName()); 			//
		
	}

}

