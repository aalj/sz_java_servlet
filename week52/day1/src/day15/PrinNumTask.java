/**
 * PrinNumTask.java
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

import java.util.concurrent.RecursiveAction;

/**
 * ClassName:PrinNumTask
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   liang
 * @version  
 * @since    Ver 1.1
 * @Date	 2015��12��21��		����2:00:14
 *
 * @see 	 

 */
public class PrinNumTask extends RecursiveAction {
	final static int THRESHOLO = 10;
	int start;	//��ʼ����
	int end;	//��������
	
	public PrinNumTask(int start, int end) {
		this.start = start;
		this.end = end;
	}

	//���м���
	@Override
	protected void compute() {
		//�������--->С�������,С����ֻ��ӡ10������
		if (end-start<=THRESHOLO) {
			for (int i = start; i <end ; i++) {
				System.out.println(Thread.currentThread().getName()+"   "+i);
				
			}
		}else{//������ܴ�,�ֽ��������µ��߳���ɸ�������
			//�ֽ����,��
			int middle = (start+end)/2;
			PrinNumTask left = new PrinNumTask(start, middle);
			PrinNumTask right = new PrinNumTask(middle, end);
			left.fork();//�µ��߳�.��ӡ
			right.fork();//
			
		}
		
		
	}


}

