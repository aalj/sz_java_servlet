/**
 * AppClassLoaderDemo.java
 * day17
 *
 * Function�� TODO 
 *
 *   ver     date      		author
 * ��������������������������������������������������������������������
 *   		 2015��12��23�� 		liang
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
 * @Date	 2015��12��23��		����9:14:12
 *
 * @see 	 

 */
public class AppClassLoaderDemo {

	public static void main(String[] args) {
		//�ĸ�������������˵�ǰ�����
		//�����AppClassLoaderDemo�������������
		ClassLoader classLoader = AppClassLoaderDemo.class.getClassLoader(); 
		//ϵͳ������
		ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
		//ϵͳ��������ĸ�������,��չ�������
		ClassLoader cl1 = classLoader.getParent();
		//�õ����������,��������
		ClassLoader parent = cl1.getParent() ;

	}

}

