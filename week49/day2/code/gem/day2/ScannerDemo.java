/**
 * ScannerDemo.java
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
 * ClassName:ScannerDemo
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   view
 * @version  
 * @since    Ver 1.1
 * @Date	 2015年12月1日		上午9:15:19
 *
 * @see 	 

 */
public class ScannerDemo {

	public static void main(String[] args) {
		System.out.println("输入一个整数");
		Scanner scan = new Scanner(System.in);
		int s = scan.nextInt();
		int sum = 0;
		for (int i = 1; i <=s; i++) {
			sum+=i;
		}
		System.out.println("sum= "+sum);
		sum = 0;
		int temp=0;
		while (temp<s) {
			temp++;
			
			sum+=temp;
		}
		System.out.println("sum= "+sum);
		sum = 0;
	 temp=0;
		do {
			++temp;
			sum+=temp;
		} while (temp<s);
		System.out.println("sum= "+sum);
	}

}

