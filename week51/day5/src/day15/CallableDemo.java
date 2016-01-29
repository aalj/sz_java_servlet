/**
 * CallableDemo.java
 * day15
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月18日 		Stone_A
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package day15;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * ClassName:CallableDemo Function: 使用Callable和Future创建线程 Reason: TODO ADD
 * REASON
 *
 * @author Stone_A
 * @version
 * @since Ver 1.1
 * @Date 2015年12月18日 上午9:36:50
 *
 * @see
 * 
 */
public class CallableDemo {
	public static void main(String[] args) {
		// 使用Callable,Future来创建线程对象
		//2.创建一个FutureTask对象
		FutureTask<Integer> futureTask = new FutureTask<Integer>(new computer());
		//3.FutureTask是实现了Runable接口,一该对象创建一个Thread对象
		new Thread(futureTask).start();
		//获得运算结果
		try {
			Integer integer = futureTask.get();
			System.out.println(integer);
		} catch (InterruptedException | ExecutionException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}

}

// 1.写一个类实现Callable接口
class computer implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		int a = 0;
		for (int i = 0; i < 100; i++) {
			a += i;
			Thread.sleep(100);
		}

		return a;

	}

}
