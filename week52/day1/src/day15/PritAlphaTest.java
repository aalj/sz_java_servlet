/**
 * PritAlpha.java
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
 * ClassName:PritAlpha Function: ���������������� * Reason: TODO ADD REASON
 *
 * @author liang
 * @version
 * @since Ver 1.1
 * @Date 2015��12��21�� ����10:19:03
 *
 * @see
 * 
 */
public class PritAlphaTest {
	public static void main(String[] args) {
		PritAlpha alpha = new PritAlpha();
		//�����д��ĸ
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
		//���Сд��ĸ
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
