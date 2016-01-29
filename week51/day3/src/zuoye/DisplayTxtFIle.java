/**
 * DisplayTxtFIle.java
 * zuoye
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月16日 		Stone_A
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package zuoye;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * ClassName:DisplayTxtFIle
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   Stone_A
 * @version  
 * @since    Ver 1.1
 * @Date	 2015年12月16日		下午6:50:42
 *
 * @see 	 

 */
public class DisplayTxtFIle {

	public static void main(String[] args) {
		System.out.println(args[0]);
		
		try {
			Reader re = new FileReader(args[0]);
			char[] buf = new char[1024];
			int len = 0;
			while ((len=re.read(buf))!=-1) {
				System.out.println(new String(buf,0,len));
				re.read(buf);
			}
			
		} catch (IOException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		
		

	}

}

