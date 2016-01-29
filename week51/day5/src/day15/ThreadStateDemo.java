/**
 * ThreadStateDemo.java
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

import java.lang.Thread.State;

import sun.net.www.content.text.plain;

/**
 * ClassName:ThreadStateDemo
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   Stone_A
 * @version  
 * @since    Ver 1.1
 * @Date	 2015年12月18日		上午10:54:00
 *
 * @see 	 

 */
public class ThreadStateDemo {

	public static void main(String[] args) {
		//说明线程的状态
		Thread t= new Thread(new PrintLetterTask());
		System.out.println("t1"+"  "+t.getState());
		t.start();
		
	}

}
//线程,类实现Runnable接口

class PrintLetterTask implements Runnable{

	@Override
	public void run() {
		State state = Thread.currentThread().getState();
		System.out.println(state);
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.print(i+" ");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
		}
		System.out.println(Thread.currentThread().getState());
	}
	
}
