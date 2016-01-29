/**
 * ThreadLocalDemo.java
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

/**
 * ClassName:ThreadLocalDemo Function: TODO ADD FUNCTION Reason: TODO ADD REASON
 *
 * @author liang
 * @version
 * @since Ver 1.1
 * @Date 2015年12月21日 下午2:23:00
 *
 * @see
 * 
 */
public class ThreadLocalDemo {

	public static void main(String[] args) {
		// 说明ThreadLocal变量
		// 创建两个线程,调用inc方法,在线程中观察I的状况
		Value v = new Value();
		// 一个线程
		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					v.inc2();
					System.out.println(Thread.currentThread().getName() + "  " + v.t.get());
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {

						//
						e.printStackTrace();

					}

				}

			}
		}).start();
		// 另一个线程
		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					v.inc2();
					System.out.println(Thread.currentThread().getName() + "  " + v.t.get());
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {

						//
						e.printStackTrace();

					}

				}

			}
		}).start();
	}

}
