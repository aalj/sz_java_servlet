/**
 * InvoString.java
 * zuoye
 *
 * Function�� TODO 
 *
 *   ver     date      		author
 * ��������������������������������������������������������������������
 *   		 2015��12��23�� 		liang
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package zuoye;

import java.lang.reflect.Method;

/**
 * ClassName:InvoString
 * Function: ͨ���������String�����һ������
 * Reason:	 TODO ADD REASON
 *
 * @author   liang
 * @version  
 * @since    Ver 1.1
 * @Date	 2015��12��23��		����5:28:30
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

