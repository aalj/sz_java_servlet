/**
 * PritAlpha.java
 * day15
 *
 * Function�� TODO 
 *
 *   ver     date      		author
 * ��������������������������������������������������������������������
 *   		 2015��12��21�� 		liang
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package day15;
/**
 * ClassName:PritAlpha
 * Function: ���������������� 
 *  * Reason:	 TODO ADD REASON
 *
 * @author   liang
 * @version  
 * @since    Ver 1.1
 * @Date	 2015��12��21��		����10:19:03
 *
 * @see 	 

 */
public class PritAlpha {
	//����һ����������ֵ�˭
	boolean flag= true;
	//1����ͳ����  synchronized  wait   notifyAll 
	//2���·�����Lock  Condition aWaint   signalAll
	
	//�����д���ַ�
	public synchronized void printUpper(char ch){
		//�Ƿ��ֵ���  whileѭ��
		while (!flag) {
			try {
				//���ĸ�����this���ϵȣ���ǰ�̣߳�����this����ȴ�����
				this.wait();
				//�ͷ���ӵ�е���
			} catch (InterruptedException e) {
				
				// 
				e.printStackTrace();
				
			}
		}
			
			System.out.println(ch);
			flag= !flag;
			this.notifyAll();
		
			//û���ֵ���,��
			
		//����ֵ���,��
	}
	
	
	//���Сд���ַ�
	public synchronized void printLower(char ch){
		//�Ƿ��ֵ���
			//û���ֵ���,��
			
		while (flag) {
			try {
				//���ĸ�����this���ϵȣ���ǰ�̣߳�����this����ȴ�����
				this.wait();
				//�ͷ���ӵ�е���
			} catch (InterruptedException e) {
				
				// 
				e.printStackTrace();
				
			}
		}
			System.out.println(ch);
			flag= !flag;
			this.notifyAll();
		
		//����ֵ���,��
		
	}
}

