/**
 * URLEncoderDemo.java
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

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * ClassName:URLEncoderDemo
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   liang
 * @version  
 * @since    Ver 1.1
 * @Date	 2015年12月21日		下午3:28:37
 *
 * @see 	 

 */
public class URLEncoderDemo {

	public static void main(String[] args) throws UnsupportedEncodingException {
		//说明URLEncoder  URLDecoder 的方法
		String url = "http://localhost:8080/web/中文";
		String encode = URLEncoder.encode(url,"utf-8");
		System.out.println(encode);
		String decode = URLDecoder.decode(encode, "utf-8");
		System.out.println(decode);
		
	}

}

