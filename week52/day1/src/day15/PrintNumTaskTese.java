/**
 * PrintNumTaskTese.java
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

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/**
 * ClassName:PrintNumTaskTese
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   liang
 * @version  
 * @since    Ver 1.1
 * @Date	 2015��12��21��		����2:11:15
 *
 * @see 	 

 */
public class PrintNumTaskTese {

	public static void main(String[] args) {
		ForkJoinPool pool = new ForkJoinPool(6);
		PrinNumTask task = new PrinNumTask(1, 50);
		pool.submit(task);
		try {
			//����һ  ��ֵ  ������   ��ֵ��λ
			pool.awaitTermination(10, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			
			//
			e.printStackTrace();
			
		}
		pool.shutdown();
	}

}

