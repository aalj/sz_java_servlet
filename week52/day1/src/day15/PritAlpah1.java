/**
 * PritAlpah1.java
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

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ClassName:PritAlpah1
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   liang
 * @version  
 * @since    Ver 1.1
 * @Date	 2015年12月21日		上午11:13:24
 *
 * @see 	 

 */
public class PritAlpah1 {
	Lock  lock = new ReentrantLock();
	Condition cond = lock.newCondition();
	boolean  flag= true;
	public void printUpper(char ch){
		try {
			lock.lock();
			while (!flag) {
				cond.await();
			}
			
			System.out.println(ch);
			flag= !flag;
			cond.signalAll();
			
			
		} catch (InterruptedException e) {
			
			//
			e.printStackTrace();
			
		} 
		finally{
			lock.unlock();
		}
	}
	
	
	
}

