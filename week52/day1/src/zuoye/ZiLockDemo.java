/**
 * Day16.java
 * zuoye
 *
 * Function�� TODO 
 *
 *   ver     date      		author
 * ��������������������������������������������������������������������
 *   		 2015��12��21�� 		liang
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package zuoye;

/**
 * ClassName:Day16 Function: ģ���߳�ͬ������ Reason: TODO ADD REASON
 *
 * @author liang
 * @version
 * @since Ver 1.1
 * @Date 2015��12��21�� ����5:34:04
 *
 * @see
 * 
 */
public class ZiLockDemo {

	public static void main(String[] args) {
		Set set = new Set();
		new Thread(new Runnable() {
			public void run() {
				while(true){
					set.setCar();
				}
			}
		}).start();
		new Thread(new Runnable() {
			public void run() {
				while(true){
					set.setCar();
				}
			}
		}).start();
		new Thread(new Runnable() {
			public void run() {
				while(true){
					set.getCar();
				}
			}
		}).start();
		new Thread(new Runnable() {
			public void run() {
				while(true){
					set.getCar();
				}
			}
		}).start();

	}

}

class Set {
	boolean flag = true;
	int a = 0;

	public synchronized void setCar() {
		while (!flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {

				//
				e.printStackTrace();

			}

		}
		System.out.println("����һ����" + "  " + a++);
		flag = !flag;
		this.notify();

	}

	public synchronized void getCar() {
		while (flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {

				//
				e.printStackTrace();

			}

		}
		System.out.println("����һ����" + "  " + a);
		flag = !flag;
		this.notify();
	}

}
