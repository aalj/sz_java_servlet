/**
 * NIOCopy2.java
 * day14
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月17日 		Stone_A
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package day14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * ClassName:NIOCopy2 Function: TODO ADD FUNCTION Reason: TODO ADD REASON
 *
 * @author Stone_A
 * @version
 * @since Ver 1.1
 * @Date 2015年12月17日 上午11:21:10
 *
 * @see
 * 
 */
public class NIOCopy2 {

	public static void main(String[] args) throws IOException {
		// 获得输入文件的FileChannel
		FileInputStream fileInputStream = new FileInputStream(
				"G:\\SuZhou_Android\\week51\\day4\\src\\day14\\NIOCopy.java");
		FileChannel channel = fileInputStream.getChannel();

		// 获得输出文件的FileChannel
		FileOutputStream fout = new FileOutputStream("G:\\SuZhou_Android\\week51\\day4\\src\\day14\\NIOCopy1.txt");
		FileChannel channel2 = fout.getChannel();

		java.nio.ByteBuffer buffer = ByteBuffer.allocate(512);
		// buffer:position limit
		while (channel.read(buffer) != -1) {
			buffer.flip();
			channel2.write(buffer);
			buffer.clear();

		}
		// 关闭相应资源
		fileInputStream.close();
		channel.close();
		fout.close();
		channel2.close();

	}

}
