/**
 * JudgePrime.java
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
 * ClassName:JudgePrime
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   view
 * @version  
 * @since    Ver 1.1
 * @Date	 2015年12月1日		下午4:00:59
 *
 * @see 	 

 */
public class JudgePrime {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("输入一个整数");
		int num = scan.nextInt();
//		boolean temp = false;
//		for (int i = 2; i <= (int )(Math.sqrt(num)); i++) {
//			if(num%i==0){
//				temp = false;
//				
//				   
//				
//			}else{
//				temp = true;
//			}
//		}
//		if (temp) {
//			System.out.println(num+"是质数");
//		}else{
//			System.out.println(num+"不是质数");
//			
//		}
		for (int i = 2; i <= (int )(Math.sqrt(num)+1); i++) {
			if(num%i==0){
				System.out.println(num+"不是质数");
			break;
			}
			if(i == (int) (Math.sqrt(i) + 1)) {
				System.out.println(num+"是质数");

			
				
			}
		}

	}

}

