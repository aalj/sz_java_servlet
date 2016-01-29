/**
 * ReverseTxtFileLine.java
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

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * ClassName:ReverseTxtFileLine
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   Stone_A
 * @version  
 * @since    Ver 1.1
 * @Date	 2015年12月16日		下午7:06:36
 *
 * @see 	 

 */
public class ReverseTxtFileLine {

	public static void main(String[] args) {
			try {
				BufferedReader rf = new BufferedReader(new FileReader("G:\\SuZhou_Android\\week51\\day3\\src\\zuoye\\test1.txt"));
//				rf.readLine();
				String len = null;
				int i = 3;
				String [] temp = new String[4];
				while ((len=rf.readLine())!=null) {
					temp[i--]=len;
				}
			for (String string : temp) {
				System.out.println(string);
			}
			
			} catch (IOException e) {
				
				
				e.printStackTrace();
				
			}
	}

}

