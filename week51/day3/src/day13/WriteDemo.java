/**
 * WriteDemo.java
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

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

/**
 * ClassName:WriteDemo
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   Stone_A
 * @version  
 * @since    Ver 1.1
 * @Date	 2015年12月16日		上午10:09:07
 *
 * @see 	 

 */
public class WriteDemo {

	public static void main(String[] args) {
//		try {
//			//创建一个文件输出流，FileWrite ，写入一些文件
//			File file = new File("I:\\abc\\abc");
//			Writer write = new FileWriter(file,false);
//			Reader read = new FileReader("I:\\abc\\endnota.txt");
//			char[] buf = new char[1024];
//			int len = 0;
////			write.write("看绝大部分老卡机收不到封口胶");
//			while ((len=read.read(buf))!=-1) {
//				write.write(buf, 0, len);
//			}
//			
//			
//			write.flush();
//			write.close();
//			
//			
//			
//		} catch (Exception e) {
			// TODO: handle exception
//		}
		
		try {
			File file = new File("I:\\abc\\endnota.txt");
			File tofile = new File("I:\\abc\\abc");
//			Reader read = new FileReader("I:\\abc\\endnota.txt");
			ReadWriteDemo.copyFile(file, tofile, false);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}

