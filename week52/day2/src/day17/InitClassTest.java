/**
 * InitClass.java
 * day17
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月22日 		liang
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package day17;
/**
 * ClassName:InitClass
 * Function: 反射机制的类的初始化测试类
 * Reason:	 TODO ADD REASON
 *
 * @author   liang
 * @version  
 * @since    Ver 1.1
 * @Date	 2015年12月22日		下午3:30:22
 *
 * @see 	 

 */
public class InitClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
//		new InitClass();
		//访问类的静态变量时，会初始化类
//		int  i = InitClass.i;
//		System.out.println(i);
//		Class.forName("day17.InitClass");
		
		
//		new SubInitClass();
		
		//不初始化的三种情形
		
//		System.out.println(InitClass.i);
//		System.out.println(SubInitClass.j);
		InitClass[] init = new InitClass[10];
		
		

	}

}

