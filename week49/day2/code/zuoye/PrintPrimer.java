/**
 * PrintPrimer.java
 * zuoye
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月1日 		view
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package zuoye;

import java.util.Scanner;

/**
 * ClassName:PrintPrimer
 * <p>
 * Function: 2、输出100以内的素数 [PrintPrimer.java]
 * <p>
 * Reason: TODO ADD REASON
 *
 * @author view
 * @version
 * @since Ver 1.1
 * @Date 2015年12月1日 下午6:06:43
 *
 * @see
 * 
 */
public class PrintPrimer {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("输入一个整数");
		int num = scan.nextInt();
		primer(num);
	}

	/**
	 * 
	 * primer:(计算素数)
	 * 
	 * @param @param
	 *            num 设定文件
	 * @return void DOM对象
	 * @throws @since
	 *             CodingExample Ver 1.1
	 */
	private static void primer(int num) {
		if (num < 2) {
		}
//		if (num == 2) {
//			System.out.println("输出素数" + num);
//		}
		if(num>=2){
			
			System.out.println("输出素数" + 2);
			
		}
		for (int i = 2; i <= num; i++) {
			
			for (int j = 2; j <= (int) (Math.sqrt(i) + 1); j++) {
				if (i % j == 0) {
					break;
				}
				if (j == (int) (Math.sqrt(i) + 1)) {
					System.out.println("输出素数" + i);
				}
			}

		}
	}

}
