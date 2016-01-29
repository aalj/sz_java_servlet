/**
 * NiceCheck.java
 * zuoye
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月3日 		view
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package zuoye;

import java.util.Scanner;

/**
 * ClassName:NiceCheck Function: TODO ADD FUNCTION Reason: TODO ADD REASON
 *
 * @author view
 * @version
 * @since Ver 1.1
 * @Date 2015年12月3日 上午9:13:01
 *
 * @see
 * 
 */
public class NiceCheck {
	public static void main(String[] args) {
		// 输入一个数
		System.out.println("输入一个数,用于确定有几个格子");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		// 定义一个二维数组盛放数
		int[][] arr = new int[a][a];
		// 实现算法
		int v = 1;// 初值
		int x = 0;// 第几行
		int y = a / 2;// 第几列
		while (v <= a * a) {
			arr[x][y] = v;
			
			x = x - 1;
			y = y + 1;
			if (y > (a - 1) && x < 0) {// 行和列都越界
				x=x+2;
				y=y-1;
				
			}
			if (y > (a - 1)) {// 列越界
				y=0;
			}
			if (x < 0) {// 行越界
				x=a-1;
				
			}
			
			if (arr[x][y] > 0) {// 右上方有值
				x=x+2;
				y=y-1;
			}
			v += 1;
		}
		// 初始值 ,V=1,放在第一行的中间
		// 放在右上方
		/*
		 * 1.列越界,放在行的最左边<p> 2.行越界,放在列的最下面 3.行列均越界,放在这个数的下边 4. 右上方有值
		 */

		// 输出二维数组
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
