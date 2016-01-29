/**
 * DisPlayTextFILE.java
 * homework
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月17日 		Stone_A
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package homework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * ClassName:DisPlayTextFILE Function: 作业第一题 Reason: TODO ADD REASON
 *
 * @author Stone_A
 * @version
 * @since Ver 1.1
 * @Date 2015年12月17日 上午9:09:44
 *
 * @see
 * 
 */
public class DisPlayTextFile {

	public static void main(String[] args) {
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new FileReader(args[0]));
			char[] buf = new char[1024];
			String len = null;
			while ((len = bufferedReader.readLine()) != null) {
				System.out.println(len);
			}
		} catch (FileNotFoundException e) {
			System.out.println("文件不存在,文件路径错误");
			e.printStackTrace();

		} catch (IOException e) {

			System.out.println("文件读取错误");
			e.printStackTrace();

		} finally {
			try {
				if (bufferedReader!=null) {
					
					bufferedReader.close();
				}
			} catch (IOException e) {

				System.out.println("输入流出错");
				e.printStackTrace();

			}
		}
	}

}
