/**
 * InitClass.java
 * day17
 *
 * Function�� TODO 
 *
 *   ver     date      		author
 * ��������������������������������������������������������������������
 *   		 2015��12��22�� 		liang
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package day17;

/**
 * ClassName:InitClass Function: ������Ƶ���ĳ�ʼ�� Reason: TODO ADD REASON
 *
 * @author liang
 * @version
 * @since Ver 1.1
 * @Date 2015��12��22�� ����3:30:22
 *
 * @see
 * 
 */
public class InitClass {
	static int j = 100;
	final static int i = 0 ;
	{
	System.out.println("ʵ����ʼ����");
	}
	static{
		System.out.println("��̬��ʼ����");
	}
	public InitClass() {
		System.out.println("���캯��");
		 

	}

	public static void main(String[] args) {

	}

}


class SubInitClass extends InitClass{
	static{
		System.out.println("SubInitClass��̬�����");
	}
}
