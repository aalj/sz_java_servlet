/**
 * ClassDemo.java
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

import java.lang.reflect.Method;

/**
 * ClassName:ClassDemo<br/>
 * Function: 获得Class对象的三种方法<br/>
 * Reason: TODO ADD REASON<br/>
 *
 * @author liang
 * @version
 * @since Ver 1.1
 * @Date 2015年12月23日 上午9:58:31
 *
 * @see
 * 
 */
public class ClassStudentDemo {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		//说明获得Method对象的几个方法
		//getMethods（）  	public   含有父类的方法
		//getDeclareMethods（）	与权限无关      不含父类的方法
		Class<Student> c= Student.class;
		Method[] methods = c.getMethods();
		for (Method method : methods) {
			System.out.println(method.toGenericString());
		}
		Method[] declaredMethods = c.getDeclaredMethods();
		System.out.println("=========================");
		for (Method method : declaredMethods) {
			System.out.println(method.toGenericString());
			
		}
		//获得指定的方法
		Method method = c.getMethod("setName",  String.class);
		System.out.println(method.toGenericString());
		
		
		
		
		
	}

}
