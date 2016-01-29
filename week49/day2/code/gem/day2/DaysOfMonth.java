/**
 * DaysOfMonth.java
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
 * ClassName:DaysOfMonth Function: 计算某年某月的天数 Reason: TODO ADD REASON
 *
 * @author view
 * @version
 * @since Ver 1.1
 * @Date 2015年12月1日 下午2:58:52
 *
 * @see
 * 
 */
public class DaysOfMonth {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("输入任意年份");
		int year = scan.nextInt();
		System.out.println("输入任意月份");
		int month = scan.nextInt();
		boolean temp = true;
		int[] month_31 = { 1, 3, 5, 7, 8, 10, 12 };
		int[] month_30 = { 4, 6, 9, 11 };
		//判断二月的情况
		if(panduannian(year)){
			if(month==2){
				
			System.out.println(month + "月是29天");
			}
		}else{
			if(month==2){
				
				System.out.println(month + "月是28天");
			}
		}
		//判断31天的情况
		if (temp) {
			for (int i : month_31) {
				System.out.println("31天测试是否走该语句");
				if (month == i) {
					System.out.println(month + "月是31天");
					temp = false;
					break;
				}

			}

		}
		//判断30填的情况
		if (temp) {
			System.out.println("30天测试是否走该语句");
			for (int i : month_30) {
				if (month == i) {
					System.out.println(month + "月是30天");
				}
			}
		}

	}


	private static boolean panduannian(int year) {
		if (year % 4 == 0 && year % 100 != 0 || year % 100 == 0 && year % 400 == 0) {
			return true;
		}

		return false;
	}

}
