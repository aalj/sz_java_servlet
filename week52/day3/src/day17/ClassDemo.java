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
public class ClassDemo {
	String name  = null;
	int age = 0 ;

	public static void main(String[] args) {
		// ����һ������.class
		Class<ClassDemo> class1 = ClassDemo.class;
		Class c2 = Integer.class;
		Class c = int.class;
		// ����2��ͨ�������ϵ�getClass������Ҳ�ܻ�ö�Ӧ�������
		ClassDemo cd = new ClassDemo();
		// �õ�Class����
		Class c3 = cd.getClass();
		Class c1 = null;
		// ������������ַ�����Class.forName()
		try {
			  c1 = Class.forName("day17.ClassDemo");
		} catch (ClassNotFoundException e) {

			//
			e.printStackTrace();

		}
		//��ֻ����һ�Σ���ʼ���ִ࣬�о�̬��ʼ����
		System.out.println(class1==c3);
		System.out.println(c1==c3);
		
		
		
		
	}

}
