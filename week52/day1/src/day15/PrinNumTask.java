/**
 * PrinNumTask.java
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

import java.util.concurrent.RecursiveAction;

/**
 * ClassName:PrinNumTask
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   liang
 * @version  
 * @since    Ver 1.1
 * @Date	 2015年12月21日		下午2:00:14
 *
 * @see 	 

 */
public class PrinNumTask extends RecursiveAction {
	final static int THRESHOLO = 10;
	int start;	//开始数字
	int end;	//最后的数字
	
	public PrinNumTask(int start, int end) {
		this.start = start;
		this.end = end;
	}

	//并行计算
	@Override
	protected void compute() {
		//大的任务--->小任务完成,小任务只打印10个数字
		if (end-start<=THRESHOLO) {
			for (int i = start; i <end ; i++) {
				System.out.println(Thread.currentThread().getName()+"   "+i);
				
			}
		}else{//当任务很大,分解任务用新的线程完成各个任务
			//分解成左,右
			int middle = (start+end)/2;
			PrinNumTask left = new PrinNumTask(start, middle);
			PrinNumTask right = new PrinNumTask(middle, end);
			left.fork();//新的线程.打印
			right.fork();//
			
		}
		
		
	}


}

