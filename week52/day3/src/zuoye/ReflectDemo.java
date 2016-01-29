/**
 * ReflectDemo.java
 * zuoye
 *
 * Function�� TODO 
 *
 *   ver     date      		author
 * ��������������������������������������������������������������������
 *   		 2015��12��23�� 		liang
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package zuoye;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * ClassName:ReflectDemo
 * Function: ͨ�������в�����ȫ��������Class���󣬲����ش��������µ�ȫ�����캯���Լ�����
 * Reason:	 TODO ADD REASON
 *
 * @author   liang
 * @version  
 * @since    Ver 1.1
 * @Date	 2015��12��23��		����5:20:23
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

