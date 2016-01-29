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

package day2.test1;

import java.io.File;
import java.io.FilenameFilter;
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
public class Demo {

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
		
		String[] list2 = file.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				if (dir.isDirectory()) {
					return false;
				}else{
					return name.endsWith("java");
				}
				
			}
		});
		for (int i = 0; i < list2.length; i++) {
			list.add(list2[i]);
		}
		
		
		
		return list;
	}

}

