/**
 * ThreadPoolDemo.java
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

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * ClassName:ThreadPoolDemo
 * Function: 示例说明线城池的用法
 * Reason:	 TODO ADD REASON
 *
 * @author   liang
 * @version  
 * @since    Ver 1.1
 * @Date	 2015年12月21日		上午11:28:40
 *
 * @see 	 

 */
public class ThreadPoolDemo {

	public static void main(String[] args) {
		//创建一固定数目的线程池对象
		ExecutorService pool = Executors.newFixedThreadPool(3);
		//提交任务，两种表现形式（Runnable(不需要返回值)   Callable(需要返回值)）
		//提交一个Runnable任务
		pool.submit(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(Thread.currentThread().getName()+" "+i+" ");
				}
				
			}
		});
		//提交一个Callable任务
		Future<Integer> submit = pool.submit(new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {
				for (int i = 0; i < 10; i++) {
					System.out.println(Thread.currentThread().getName()+" "+i+" ");
				}
				
				return 100 ;
				
			}
		});
		try {
			System.out.println(submit.get());
		} catch (InterruptedException e) {
			
			//
			e.printStackTrace();
			
		} catch (ExecutionException e) {
			
			//
			e.printStackTrace();
			
		}
		
		//获得call的返回值
		
		//关闭线程池
		pool.shutdown();
	}

}

