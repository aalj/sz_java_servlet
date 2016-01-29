/**
 * PrintNmum.java
 * zuoye
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月21日 		liang
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package zuoye;

/**
 * ClassName:PrintNmum Function: TODO ADD FUNCTION Reason: TODO ADD REASON
 *
 * @author liang
 * @version
 * @since Ver 1.1
 * @Date 2015年12月21日 下午7:36:56
 *
 * @see
 * 
 */
public class PrintNmumTest {

	public static void main(String[] args) {
		PrintNmum num = new PrintNmum();
		new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					num.printa(num);
				}
			}
		}).start();
		new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 20; i++) {
					num.printa(num);
				}
			}
		}).start();

	}

}

class PrintNmum {
	int i = 0;
	ThreadLocal<Integer> t = new ThreadLocal<Integer>() {
		@Override
		protected Integer initialValue() {

			return 0;

		}
	};

	void printa(PrintNmum num) {
		synchronized (num) {
			try {
				t.set(t.get() + 1);
				Thread.sleep(100);
				System.out.println(t.get());
			} catch (Exception e) {
				// TODO: handle exception
			}

		}

	}

}
