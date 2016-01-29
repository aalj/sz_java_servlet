/**
 * PrintNumTaskTese.java
 * day15
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月21日 		liang
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
 * @Date	 2015年12月21日		下午2:11:15
 *
 * @see 	 

 */
public class PrintNumTaskTese {

	public static void main(String[] args) {
		ForkJoinPool pool = new ForkJoinPool(6);
		PrinNumTask task = new PrinNumTask(1, 50);
		pool.submit(task);
		try {
			//参数一  数值  参数二   数值单位
			pool.awaitTermination(10, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			
			//
			e.printStackTrace();
			
		}
		pool.shutdown();
	}

}

