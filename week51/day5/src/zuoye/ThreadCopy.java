/**
 * ThreadCopy.java
 * day15
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月21日 		liang
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package zuoye;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ClassName:ThreadCopy
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   liang
 * @version  
 * @since    Ver 1.1
 * @Date	 2015年12月21日		上午9:05:21
 *
 * @see 	 

 */
public class ThreadCopy implements  Runnable {
	/**
	 * 
	 * Creates a new instance of ThreadCopy.
	 *
	 * @param start		文件开始的位置
	 * @param end		文件结束的位置
	 * @param srcFile	源文件
	 * @param destFile	目标文件
	 */
	public ThreadCopy(int start, int end, File srcFile, File destFile) {
		this.start = start;
		this.end = end;
		this.srcFile = srcFile;
		this.destFile = destFile;
	}
	private int start;
	private int end;
	private File srcFile;
	private File destFile;
	private RandomAccessFile srcFileA;
	private RandomAccessFile desFileA;
	//拷贝文件的一部分(Start开始的位置),end结束的位置
	//源文件---->目标文件.文件(文件名,File对象)
	@Override
	public void run() {
		try {
			srcFileA = new RandomAccessFile(this.srcFile, "r");
			desFileA = new RandomAccessFile(this.destFile, "rw");
			desFileA.setLength(srcFileA.length());
			//文件写的指针偏移
			srcFileA.seek(start);
			desFileA.seek(start);
			//缓存的数组
			byte[] buf = new byte[1024*1024];
			//实际读出的长度
			int len = 0;
			int por = 0;
//			srcFileA.getFilePointer()//上次独读出的指针位置
			//从文件中读出一个字节数组到buff
			while ((len=srcFileA.read(buf))!=-1) {
				//如果读出的数据以及越界
				if(srcFileA.getFilePointer()>end){
					len = (int) (end-por);
					desFileA.write(buf,0,len);
					break;
				}
					desFileA.write(buf,0,len);
				
				
			}
		} catch (FileNotFoundException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (IOException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}finally{
			try {
				desFileA.close();
				srcFileA.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

}

