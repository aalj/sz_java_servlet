/**
 * CreateObj.java
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

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * ClassName:CreateObj
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   liang
 * @version  
 * @since    Ver 1.1
 * @Date	 2015年12月23日		下午5:35:54
 *
 * @see 	 

 */
public class CreateObj {

	public static void main(String[] args) {
		try {
			Class forName = Class.forName("zuoye.Student");
			Constructor<Student> constructor = forName.getConstructor(String.class,int.class);
			Student stu = (Student)constructor.newInstance("张三丰",101);
			System.out.println(stu.getName());
			
		} catch (ClassNotFoundException e) {
			
			//
			e.printStackTrace();
			
		} catch (InstantiationException e) {
			
			//
			e.printStackTrace();
			
		}  catch (NoSuchMethodException e) {
			
			//
			e.printStackTrace();
			
		} catch (SecurityException e) {
			
			//
			e.printStackTrace();
			
		} catch (IllegalArgumentException e) {
			
			//
			e.printStackTrace();
			
		} catch (InvocationTargetException e) {
			
			//
			e.printStackTrace();
			
		} catch (IllegalAccessException e) {
			
			//
			e.printStackTrace();
			
		}
		
		
		

	}

}

