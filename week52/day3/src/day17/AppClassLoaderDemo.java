/**
 * AppClassLoaderDemo.java
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
 * ClassName:AppClassLoaderDemo
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   liang
 * @version  
 * @since    Ver 1.1
 * @Date	 2015年12月23日		上午9:14:12
 *
 * @see 	 

 */
public class AppClassLoaderDemo {

	public static void main(String[] args) {
		//哪个类加载器加载了当前这个类
		//获得类AppClassLoaderDemo的类加载器对象
		ClassLoader classLoader = AppClassLoaderDemo.class.getClassLoader(); 
		//系统加载器
		ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
		//系统类加载器的父加载器,扩展类加载器
		ClassLoader cl1 = classLoader.getParent();
		//得到跟类加载器,根加载器
		ClassLoader parent = cl1.getParent() ;

	}

}

