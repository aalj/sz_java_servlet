/**
 * ListFileDemo.java
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
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:ListFileDemo
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   Stone_A
 * @version  
 * @since    Ver 1.1
 * @Date	 2015年12月15日		下午4:33:31
 *
 * @see 	 

 */
public class ListFileDemo {
	public static void main(String[] args) {
		File file = new File("src\\day2");
//		List<String> showFileName = showFileName(file);
//		for (int i = 0; i < showFileName.size(); i++) {
//			System.out.println(showFileName.get(i)
//					);
//		}
//		System.out.println(showFileName.size());
//		System.out.println(showFileName(file));
		File[] list = file.listFiles(
				new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				System.out.println(dir.getAbsolutePath());
				return true;
//				return true;
				
			}
		}
				);
//		for (File string : list) {
//			System.out.println(string.getAbsolutePath());
//		}
	}
	public static List<String> showFileName(File file){
		List<String> list = new ArrayList<>();
//		File file = new File("D:\\");
		File[] listFiles = file.listFiles();
		for (int i = 0; i < listFiles.length; i++) {
			if (listFiles[i].isDirectory()) {
				showFileName(listFiles[i]);
			}else{
				String name = listFiles[i].getAbsolutePath();
				if (name.endsWith("java")) {
					list.add(listFiles[i].getAbsolutePath());
//					System.out.println(listFiles[i].getAbsolutePath());
				}
			}
			
		}
		return list;
	}

}

