/**
 * RandomAccessFileDemo.java
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

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.RandomAccess;

/**
 * ClassName:RandomAccessFileDemo Function: TODO ADD FUNCTION Reason: TODO ADD
 * REASON
 *
 * @author Stone_A
 * @version
 * @since Ver 1.1
 * @Date 2015年12月16日 下午2:18:04
 *
 * @see
 * 
 */
public class RandomAccessFileDemo {

	public static void main(String[] args) throws IOException {
		// 创建一个以读写的模式的RandomAccess,文件名data.dat
		RandomAccessFile accessFile = new RandomAccessFile("I:\\abc\\endnota.txt", "rw");
		// //写一些数据
		// //写一个整数
		// accessFile.writeInt(100);
		// accessFile.writeFloat(12.5f);
		// accessFile.writeUTF("45645465465");
		// //在从这个文件中读出这些数据
		// accessFile.close();
		
		//移动指针
//		accessFile.seek(pos);
		
		
		// 从文件cde1中读出数据
//		int i = accessFile.readInt();
//		System.out.println(i);
//		float a = accessFile.readFloat();
//		System.out.println(a);
		String aa = accessFile.readUTF();
		System.out.println(aa);
		accessFile.close();
	}

}
