/**
 * Value.java
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
 * ClassName:Value
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   liang
 * @version  
 * @since    Ver 1.1
 * @Date	 2015��12��21��		����2:23:09
 *
 * @see 	 

 */
public class Value {
	//�Ա���ͨ���� ThreadLocal����
	int i;
	
	ThreadLocal<Integer> t=new ThreadLocal<Integer>(){
		@Override
		protected Integer initialValue() {
			
			//���س�ֵ,int==>Integer
			return 0;
			
		}
	};
	
	
	//�Ա���i��1
	void inc(){
		i++;
	}
	
	//�Ա���t�а�װ��������1
	void inc2(){
		t.set(t.get()+1);
	}
	
	
}

