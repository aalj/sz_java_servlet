/**
 * Accurt.java
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

import java.util.concurrent.locks.ReentrantLock;

/**
 * ClassName:Accurt Function: 关于线程的同步的问题 Reason: TODO ADD REASON
 *
 * @author Stone_A
 * @version
 * @since Ver 1.1
 * @Date 2015年12月18日 下午2:41:10
 *
 * @see
 * 
 */
public class Accurt {
	// 创建Lock对象
	private final ReentrantLock lock = new ReentrantLock();
	int balaance = 10000;
	// 方法:取钱的方法

	public void getMomey(int money, String name) {
		//加锁
		lock.lock();
		try {
			if (money <= balaance) {
				Thread.currentThread().setName("");
				// 谁取走了money
				System.out.println(Thread.currentThread().getName() + "取走了" + money + "元钱");

				this.balaance = this.balaance - money;
				System.out.println("余额是:  " + balaance);
			} else {
				System.out.println("想的真多");
			}
		} finally {
			//释放锁
			lock.unlock();
		}
	}

	public void getMomey1(int money, String name) {
		if (money <= balaance) {
			Thread.currentThread().setName("");
			// 谁取走了money
			System.out.println(Thread.currentThread().getName() + "取走了" + money + "元钱");

			this.balaance = this.balaance - money;
			System.out.println("余额是:  " + balaance);
		} else {
			System.out.println("想的真多");
		}
	}

	public static void main(String[] args) {

	}

}
