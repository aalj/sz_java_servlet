/**
 * IntputStream.java
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

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

/**
 * ClassName:IntputStream
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   Stone_A
 * @version  
 * @since    Ver 1.1
 * @Date	 2015年12月16日		上午11:00:36
 *
 * @see 	 

 */
public class IntputStream {

	public static void main(String[] args) {
		
		try {
			InputStream in= new FileInputStream("I:\\abc\\260079.jpg");
			OutputStream oup = new FileOutputStream("I:\\abc\\123.jpg",false);
			byte[] buf= new byte[1024];
			int len = 0;
			while ((len = in.read(buf))!=-1){
				oup.write(buf,0,len);
			}
			
			
			
			
			
			in.close();
			oup.close();
		} catch (IOException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		

	}

}

