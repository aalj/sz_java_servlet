/**
 * ReadWriteDemo.java
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
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 * ClassName:ReadWriteDemo Function: TODO ADD FUNCTION Reason: TODO ADD REASON
 *
 * @author Stone_A
 * @version
 * @since Ver 1.1
 * @Date 2015年12月16日 上午10:39:54
 *
 * @see
 * 
 */
public class ReadWriteDemo {

	public static void main(String[] args) {

	}
	/**
	 * 
	 * copyFile:(对文件俺进行复制)
	 *
	 * @param   file  复制源
	 * @param  toFile  复制地址
	 * @param   temp  是否覆盖复制地址里面相同文件里面的内容覆盖
	 *   @throws IOException    设定文件
	 * @throws 
	 * @since  CodingExample　Ver 1.1
	 */
	public static void copyFile(File file, File toFile, boolean temp) throws IOException {
		Reader re = new FileReader(file);
		Writer wr = new FileWriter(toFile, temp);
		char[] buf = new char[1024];
		int len = 0;
		while ((len = re.read(buf)) != -1) {
			System.out.println("shifou yunxng ");
			wr.write(buf,0,len);

		}
		re.close();
		wr.close();


	}

}
