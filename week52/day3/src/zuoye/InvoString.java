/**
 * InvoString.java
 * zuoye
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月23日 		liang
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package zuoye;

import java.lang.reflect.Method;

/**
 * ClassName:InvoString
 * Function: 通过反射调用String里面的一个方法
 * Reason:	 TODO ADD REASON
 *
 * @author   liang
 * @version  
 * @since    Ver 1.1
 * @Date	 2015年12月23日		下午5:28:30
 *
 * @see 	 

 */
public class InvoString {
	public static void main(String[] args) {
		try {
			Class c = String.class;
			Method method = c.getDeclaredMethod("lastIndexOf", String.class, int.class);
			int invoke =(int) method.invoke("abcdefg","e", 6);
			System.out.println(invoke);
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	

}

