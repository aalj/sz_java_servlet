/**
 * ReflectDemo.java
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
import java.lang.reflect.Field;

/**
 * ClassName:ReflectDemo
 * Function: 通过命令行参数传全类名创建Class对象，并返回传入类名下的全部构造函数以及属性
 * Reason:	 TODO ADD REASON
 *
 * @author   liang
 * @version  
 * @since    Ver 1.1
 * @Date	 2015年12月23日		下午5:20:23
 *
 * @see 	 

 */
public class ReflectDemo {
	public static void main(String[] args) {
		try {
			Class forName = Class.forName(args[0]);
			Constructor[] declaredConstructors = forName.getDeclaredConstructors();
			Field[] declaredFields = forName.getDeclaredFields();
			for (Constructor constructor : declaredConstructors) {
				System.out.println(constructor.toGenericString());
			}
			for (Field field : declaredFields) {
				System.out.println(field.toGenericString());
			}
		} catch (ClassNotFoundException e) {
			
			//
			e.printStackTrace();
			
		}
		
	}

}

