/**
 * IOtest.java
 * day16
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月24日 		liang
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package day16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ClassName:IOtest
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   liang
 * @version  
 * @since    Ver 1.1
 * @Date	 2015年12月24日		下午10:12:02
 *
 * @see 	 

 */
public class IOtest {

	public static void main(String[] args) throws IOException {
		FileInputStream reader = new FileInputStream("src/day16/aaa.txt");
		FileOutputStream stream  = new FileOutputStream("src/day16/bbb.txt");
		byte[] buff = new byte[1];
		int len = 0;
		
		while((len=reader.read(buff))!=-1){
			stream.write(buff);
			System.out.print(new String(buff,0,len));
		}
		reader.close();
	}

}

