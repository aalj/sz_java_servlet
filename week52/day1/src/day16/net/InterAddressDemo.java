/**
 * Net.java
 * day16.net
 *
 * Function�� TODO 
 *
 *   ver     date      		author
 * ��������������������������������������������������������������������
 *   		 2015��12��21�� 		liang
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package day16.net;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * ClassName:Net
 * Function: ������
 * Reason:	 TODO ADD REASON
 *
 * @author   liang
 * @version  
 * @since    Ver 1.1
 * @Date	 2015��12��21��		����3:11:02
 *
 * @see 	 

 */
public class InterAddressDemo {

	public static void main(String[] args) throws IOException {
		//˵��InterAddreaa���÷�
		//ͨ��InetAddress�ľ�̬����byName,�����ʵ��
		InetAddress address = InetAddress.getByName("www.baidu.com");
		System.out.println(address.getHostAddress());			//IP��ַ
		System.out.println(address.getHostName() ); 			//����	
		//�����Ƿ�ɴ�
		System.out.println(address.isReachable(1000));
		//�õ����ص�InetAddressʵ��
		InetAddress address2 = InetAddress.getLocalHost();
		System.out.println(address2.getHostAddress()); 			//
		System.out.println(address2.getHostName()); 			//
		
	}

}

