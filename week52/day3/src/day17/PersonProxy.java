/**
 * PersonProxy.java
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
 * ClassName:PersonProxy
 * Function: ������
 * Reason:	 TODO ADD REASON
 *
 * @author   liang
 * @version  
 * @since    Ver 1.1
 * @Date	 2015��12��23��		����2:00:21
 *
 * @see 	 

 */
public class PersonProxy {
	//Ҫ�������
	Person p= new  PersonImpl();
	//�ṩһ����eating����һ����ǩ���ķ���
	public void eating(){
		p.eating();
	}
	
	
	public static void main(String[] args) {
		PersonProxy personProxy = new PersonProxy();
		System.out.println("�Է�Ҫ����");
		personProxy.eating();
	}
}

