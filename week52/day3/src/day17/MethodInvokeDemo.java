/**
 * MethodInvokeDemo.java
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

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * ClassName:MethodInvokeDemo
 * Function: ͨ��������÷���
 * Reason:	 TODO ADD REASON
 *
 * @author   liang
 * @version  
 * @since    Ver 1.1
 * @Date	 2015��12��23��		����10:56:47
 *
 * @see 	 

 */
public class MethodInvokeDemo {

	public static void main(String[] args) throws Exception{
		//ʾ��˵��Method������deinvoke����������һ������
		String str= "abcdefghijklmn";
		int indexOf = str.indexOf("fgh",0);
		System.out.println(indexOf);
		//���似������indexOf����
		//���S����Class����
		
		Class c= String.class;
		//������������Method����
		Method method = c.getMethod("indexOf", String.class,int.class);
		//����Mrthod�����ϵ�invoke����
		Object invoke = method.invoke("abcdefghijklmn", "fhg",0);
		System.out.println(indexOf);
		
		
		
	}

}

