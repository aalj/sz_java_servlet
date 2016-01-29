/**
 * ClassDemo.java
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

import java.lang.reflect.Method;

/**
 * ClassName:ClassDemo<br/>
 * Function: ���Class��������ַ���<br/>
 * Reason: TODO ADD REASON<br/>
 *
 * @author liang
 * @version
 * @since Ver 1.1
 * @Date 2015��12��23�� ����9:58:31
 *
 * @see
 * 
 */
public class ClassStudentDemo {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		//˵�����Method����ļ�������
		//getMethods����  	public   ���и���ķ���
		//getDeclareMethods����	��Ȩ���޹�      ��������ķ���
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
		//���ָ���ķ���
		Method method = c.getMethod("setName",  String.class);
		System.out.println(method.toGenericString());
		
		
		
		
		
	}

}
