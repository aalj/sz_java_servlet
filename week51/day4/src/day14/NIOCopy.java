/**
 * NIOCopy.java
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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;

/**
 * ClassName:NIOCopy Function: 使用NIO 实现文件拷贝 Reason: TODO ADD REASON
 *
 * @author Stone_A
 * @version
 * @since Ver 1.1
 * @Date 2015年12月17日 上午10:59:48
 *
 * @see
 * 
 */
public class NIOCopy {

	public static void main(String[] args) throws IOException {
		// NIO 实现文件的拷贝,NIOCopy.java----->NIOCopy.txt
		File f = new File("D:\\game\\DOTA2Setup20141218.rar");
		// 获得要读出的文件的一个FileChannel
		FileInputStream in = new FileInputStream(f);
		//得到相关联的通道
		FileChannel channel = in.getChannel();
		// 与内存区域建立一个映射
		MappedByteBuffer map = channel.map(MapMode.READ_ONLY, 0, f.length());
		
		// 要获得要写入的而文件的一个FileChannel
		File file = new File("D:\\game\\DOTA2Setup20141218.rar2");
		FileOutputStream outputStream = new FileOutputStream(file);
		FileChannel channel2 = outputStream.getChannel();

		// 通过这个通道写入内存的中的数据
		channel2.write(map);
		//关闭
		in.close();
		channel2.close();
		channel.close();
		outputStream.close();
	}

}
