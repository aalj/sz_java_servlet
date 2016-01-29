/**
 * IODemo.java
 * day12
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
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.Arrays;

/**
 * ClassName:IODemo Function: TODO ADD FUNCTION Reason: TODO ADD REASON
 *
 * @author Stone_A
 * @version
 * @since Ver 1.1
 * @Date 2015年12月16日 上午9:01:11
 *
 * @see
 * 
 */
public class ReadDemo {
	// I:\\abc
	public static void main(String[] args) {
		// 通过FileReader读取文件中的数据
		// Reader:关注read方法
		// FileReader: 创建对象的的方法
		try {
			File file = new File("I:\\abc\\endnota.txt");
			// FileReader(<File对象><路径字符串>)
			Reader read = new FileReader(file);

			System.out.println((char) read.read());
			char[] c = new char[1024];
			// 读到一个字符数组中
			// read.read(c);
			// 读到数组的某一部分

			// int a =read.read(c);
//			int a = read.read();
			// System.out.println(new String(c, 0, c.length));
//			while (a != -1) {
//				// System.out.print((char)a);
//				// a = read.read();
//			}
			char[] c1 = new char[1024];

			int read2 = read.read(c1);
			while (read2 != -1) {
				System.out.println(new String (c1,0,read2));
				// 显示字符数组中的数据
//				for (int i = 0; i < read2; i++) {
//					System.out.print(c1[i]);
//				}
				// 再读
				read2 = read.read(c1);

			}

			read.close();
		} catch (Exception e) {

			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

}
