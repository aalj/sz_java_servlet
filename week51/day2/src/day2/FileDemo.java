/**
 * FileDemo.java
 * day2
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月15日 		Stone_A
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package day2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * ClassName:FileDemo
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   Stone_A
 * @version  
 * @since    Ver 1.1
 * @Date	 2015年12月15日		下午4:06:02
 *
 * @see 	 

 */
public class FileDemo {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("G:\\SuZhou_Android\\week51\\day2\\笔记");
		System.out.println(file.exists()) ;
		
		String[] filename= 
				file.list();
		
		for (String string : filename) {
			if (string.endsWith("txt")) {
				
				System.out.println(string);
			}
		}
		
		File[] listFiles = file.listFiles();
for (File file2 : listFiles) {
	System.out.println(file2.getPath());
}		
		
		
	}

}

