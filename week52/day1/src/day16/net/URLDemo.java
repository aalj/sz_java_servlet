/**
 * URLDemo.java
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
 * @Date 2015年12月21日 下午3:39:31
 *
 * @see
 * 
 */
public class URLDemo {

	public static void main(String[] args) throws IOException {
		// 创建一个URL对象,学习一些方法
		try {
			URL url = new URL("https://www.baidu.com/");

			// 常见方法
			System.out.println(url.getHost() + "," + url.getPath() + "," + url.getPort());
			// 获得这个资源,在控制台输出
			InputStream openStream = url.openStream();
			// 字节流: 字节流----->字符流------>带缓存的字符流
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
