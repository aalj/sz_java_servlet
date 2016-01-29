/**
 * URLDemo.java
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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * ClassName:URLDemo Function: TODO ADD FUNCTION Reason: TODO ADD REASON
 *
 * @author liang
 * @version
 * @since Ver 1.1
 * @Date 2015��12��21�� ����3:39:31
 *
 * @see
 * 
 */
public class URLDemo {

	public static void main(String[] args) throws IOException {
		// ����һ��URL����,ѧϰһЩ����
		try {
			URL url = new URL("https://www.baidu.com/");

			// ��������
			System.out.println(url.getHost() + "," + url.getPath() + "," + url.getPort());
			// ��������Դ,�ڿ���̨���
			InputStream openStream = url.openStream();
			// �ֽ���: �ֽ���----->�ַ���------>��������ַ���
			BufferedReader bufr = new BufferedReader(new InputStreamReader(openStream));
			String a = null;
			while ((a = bufr.readLine()) != null) {
				System.out.println(a);
			}

		} catch (MalformedURLException e) {

			//
			e.printStackTrace();

		}
	}

}
