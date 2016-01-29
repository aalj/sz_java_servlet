/**
 * PrintNumber.java
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
 * ClassName:PrintNumber
 * <p>
 * Function: 4、输出以下数字形式
 *
 * @author view
 * @version
 * @since Ver 1.1
 * @Date 2015年12月1日 下午6:17:25
 *
 * @see
 * 
 */
public class PrintNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("输入杨辉三角的行数");
		int num = scan.nextInt();
		priNum(num);

	}

	/**
	 * 
	 * priNum:(打印杨辉三角的方法)
	 * 
	 * @param @param
	 *            num 设定文件
	 * @return void DOM对象
	 * @throws @since
	 *             CodingExample Ver 1.1
	 */
	private static void priNum(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = 0; j < num-i; j++) {
				System.out.print("  ");
			}
			int temp = i-1;
			for (int j = 1; j <= 2 * i - 1; j++) {
				if (j <= i) {
					System.out.print(j+" ");
				}
				if(j>i){
					System.out.print(temp--+" ");
				}
			}
			System.out.println();
		}

	}

}
