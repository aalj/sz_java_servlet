/**
 * ThreadLocalDemo.java
 * day15
 *
 * Function�� TODO 
 *
 *   ver     date      		author
 * ��������������������������������������������������������������������
 *   		 2015��12��21�� 		liang
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
 * @Date 2015��12��21�� ����2:23:00
 *
 * @see
 * 
 */
public class ThreadLocalDemo {

	public static void main(String[] args) {
		// ˵��ThreadLocal����
		// ���������߳�,����inc����,���߳��й۲�I��״��
		Value v = new Value();
		// һ���߳�
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
		// ��һ���߳�
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
