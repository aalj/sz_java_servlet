/**
 * Echo.java
 * day13
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月16日 		Stone_A
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package day13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * ClassName:Echo
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   Stone_A
 * @version  
 * @since    Ver 1.1
 * @Date	 2015年12月16日		下午1:53:18
 *
 * @see 	 

 */
public class Echo {

	public static void main(String[] args) throws IOException {
		//从键盘上第一行数据,然后输出数据
		//自节流--->字符流--->带缓存的字符流
		//		InputStreamReader  字节输入流----->>字符流
		//System.in  字节输入流
		InputStream in = System.in;//
		//从流中读出一行数据 printStream
		Reader insr = new InputStreamReader(System.in);//自节流--->字符流
		BufferedReader bufferedReader = new BufferedReader(insr);//字符流--->带缓存的字符流
		String in1= bufferedReader.readLine();
		
		//输出这行数据
		System.out.println(in1);
	}

}

