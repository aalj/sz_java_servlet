/**
 * MethodInvokeDemo.java
 * day17
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月23日 		liang
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package day17;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * ClassName:MethodInvokeDemo
 * Function: 通过反射调用方法
 * Reason:	 TODO ADD REASON
 *
 * @author   liang
 * @version  
 * @since    Ver 1.1
 * @Date	 2015年12月23日		上午10:56:47
 *
 * @see 	 

 */
public class MethodInvokeDemo {

	public static void main(String[] args) throws Exception{
		//示例说明Method对象上deinvoke方法来调用一个方法
		String str= "abcdefghijklmn";
		int indexOf = str.indexOf("fgh",0);
		System.out.println(indexOf);
		//反射技术调用indexOf方法
		//获得S听的Class对象
		
		Class c= String.class;
		//获得这个方法的Method对象
		Method method = c.getMethod("indexOf", String.class,int.class);
		//再用Mrthod对象上的invoke方法
		Object invoke = method.invoke("abcdefghijklmn", "fhg",0);
		System.out.println(indexOf);
		
		
		
	}

}

