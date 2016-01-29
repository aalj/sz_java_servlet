/**
 * ShapaeFactory.java
 * zuoye
 *
 * Function�� TODO 
 *
 *   ver     date      		author
 * ��������������������������������������������������������������������
 *   		 2015��12��7�� 		Stone_A
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package zuoye;
/*
 * ��*��̬������һ��ShapaeFactory�࣬�ڸ�����дһ������getShape(int i)���÷����ķ�������ΪShape���÷����Ĳ���Ϊһ������i������ֵ��i ������
	a) i == 0 ʱ������һ���뾶Ϊ1 ��Բ��
	b) i == 1 ʱ������һ����Ϊ3 ��Ϊ2 �ľ���
	c) i == 2 ʱ������һ���߳�Ϊ2 ��������

 */
/**
 * ClassName:ShapaeFactory
 * Function:   ʹ�ù�����������ͼ��
 * Reason:	    
 *
 * @author   Stone_A
 * @version  
 * @since    Ver 1.1
 * @Date	 2015��12��7��		����4:39:49
 *
 * @see 	 

 */
public class ShapaeFactory {
	/**
	 * 
	 * getShape:(���ڴ�����ͬ��ͼ��)
	 * <p>
	 * TODO(���������Ϊ"0"ʱ,���ذ뾶Ϊ"1"��Բ��)
	 * <p>
	 * TODO(���������Ϊ"1"ʱ,����һ����Ϊ3 ��Ϊ2 �ľ���)
	 * <p>
	 * TODO(���������Ϊ"2"ʱ,����һ���߳�Ϊ2 ��������)
	 *
	 * @param  @param i
	 * @param  @return    �趨�ļ�
	 * @return Shape    DOM����
	 * @throws 
	 * @since  CodingExample��Ver 1.1
	 */
	public Shape getShape(int i){
		if(i==0){
			return new Circle(1);
		}else if(i==1){
			return new Rect(3,2);
		}else if(i==2){
			return new Square(2);
		}
		
		return null;
	}

}

