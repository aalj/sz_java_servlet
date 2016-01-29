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
public class ClassDemo {
	String name  = null;
	int age = 0 ;

	public static void main(String[] args) {
		// 方法一、类名.class
		Class<ClassDemo> class1 = ClassDemo.class;
		Class c2 = Integer.class;
		Class c = int.class;
		// 方法2：通过对象上的getClass方法，也能获得对应的类对象
		ClassDemo cd = new ClassDemo();
		// 得到Class对象
		Class c3 = cd.getClass();
		Class c1 = null;
		// 方法三、类的字符串，Class.forName()
		try {
			  c1 = Class.forName("day17.ClassDemo");
		} catch (ClassNotFoundException e) {

			//
			e.printStackTrace();

		}
		//类只加载一次，初始化类，执行静态初始化块
		System.out.println(class1==c3);
		System.out.println(c1==c3);
		
		
		
		
	}

}
