/**
 * Demo.java
 * zuoye
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月15日 		Stone_A
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package zuoye;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:Demo
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   Stone_A
 * @version  
 * @since    Ver 1.1
 * @Date	 2015年12月15日		下午6:28:24
 *
 * @see 	 

 */
public class DemoTwo {

	public static void main(String[] args) {
		File file = new File("src\\day2");
		List<String> showFileName = showFileName(file);
		for (int i = 0; i < showFileName.size(); i++) {
			System.out.println(showFileName.get(i)
					);
		}

	}
	public static List<String> showFileName(File file){
		List<String> list = new ArrayList<>();
		
		File[] listFiles = file.listFiles();
		
		for (int i = 0; i < listFiles.length; i++) {
			//判断是否
			if (listFiles[i].isDirectory()) {
				//递归带用自己
				showFileName(listFiles[i]);
				
				
				
				
				
				
			}else{
				//判断当前不是文件夹的时候
				String name = listFiles[i].getAbsolutePath();
				if (name.endsWith("java")) {
					list.add(listFiles[i].getAbsolutePath());
				}
			}
			
		}
		return list;
	}

}

