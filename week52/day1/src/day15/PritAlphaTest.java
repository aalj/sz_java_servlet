/**
 * PritAlpha.java
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
 * ClassName:PritAlpha Function: 生产者与消费问题 * Reason: TODO ADD REASON
 *
 * @author liang
 * @version
 * @since Ver 1.1
 * @Date 2015年12月21日 上午10:19:03
 *
 * @see
 * 
 */
public class PritAlphaTest {
	public static void main(String[] args) {
		PritAlpha alpha = new PritAlpha();
		//输出大写字母
		new Thread(new Runnable() {

			@Override
			public void run() {
				for (char i = 'A'; i < 'Z'; i++) {
					alpha.printUpper(i);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						
						//
						e.printStackTrace();
						
					}
				}
			}
		}).start();
		//输出小写字母
		new Thread(new Runnable() {

			@Override
			public void run() {
				for (char i = 'a'; i < 'z'; i++) {
					alpha.printLower(i);
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
