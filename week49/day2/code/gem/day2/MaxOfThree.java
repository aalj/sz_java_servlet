/**
 * MaxOfThree.java
 * gem.day2
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月1日 		view
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package gem.day2;

import java.util.Scanner;

/**
 * ClassName:MaxOfThree Function: TODO ADD FUNCTION Reason: TODO ADD REASON
 *
 * @author view
 * @version
 * @since Ver 1.1
 * @Date 2015年12月1日 下午2:35:06
 *
 * @see
 * 
 */
public class MaxOfThree {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
//		System.out.println("输入三个数取最大值");
//		System.out.println("输入第一个数");
//		int n1 = scan.nextInt();
//		System.out.println("输入第二个数");
//		int n2 = scan.nextInt();
//		System.out.println("输入第三个数");
//		int n3 = scan.nextInt();
		// int temp = 0;
		// if (n1 - n2 > 0) {
		// temp = n1;
		// } else {
		// temp = n2;
		// }
		// if (temp - n3 > 0) {
		// System.out.println("最大数是"+temp);
		// }else{
		// System.out.println("最大数是"+n3);
		//
		// }

//		int temp = n1 > n2 ? n1 : n2;
//		temp = temp > n3 ? temp : n3;
//		System.out.println(temp);
		int[] mHits = new int[3];
		// 参数一、源数组
		// 参数二、源数组中的起始位置。
		// 参数三、目标数组。
		// 参数四、目标数据中的起始位置。
		// 参数五、要复制的数组元素的数量。
		for(int i = 1 ;i<=3;i++){
			System.arraycopy(mHits, 1, mHits, 0, mHits.length - 1);
			mHits[mHits.length - 1]=scan.nextInt();
		}
		
		for (int i : mHits) {
			System.out.println(i);
		}
	}

}
