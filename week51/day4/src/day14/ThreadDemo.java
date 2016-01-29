/**
 * ThreadDemo.java
 * day14
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月17日 		Stone_A
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package day14;

/**
 * ClassName:ThreadDemo Function: TODO ADD FUNCTION Reason: TODO ADD REASON
 *
 * @author Stone_A
 * @version
 * @since Ver 1.1
 * @Date 2015年12月17日 下午2:44:45
 *
 * @see
 * 
 */
public class ThreadDemo {

	public static void main(String[] args) {
		// 说明Thread的常见方法
		// 获得当前线程对象
		Thread currentThread = Thread.currentThread();
		currentThread.setName("我不是main");
		System.out.println(currentThread.getName());
		System.out.println(currentThread.getId());
		new Thread() {
			private Thread currentThread2;

			@Override
			public void run() {
				for (int i = 0; i < 26; i++) {
					System.out.print(i+" ");
				}

			}
		}.start();
		new Thread(new Runnable() {
			public void run() {
				for (char i= 'A';i<'Z';i++) {
					System.out.print(i+" ");
				}
			}
		}).start();
		new Thread(new Runnable() {
			public void run() {
				for (char i= 'a';i<'z';i++) {
					System.out.print(i+" ");
				}
			}
		}).start();

		
		
		
		
		
		
		
		
		
		
		
	}

}
