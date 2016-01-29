/**
 * Regular.java
 * zuoye
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月9日 		Stone_A
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package zuoye;

import java.util.Scanner;

/**
 * ClassName:Regular
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   Stone_A
 * @version  
 * @since    Ver 1.1
 * @Date	 2015年12月9日		下午4:08:59
 *
 * @see 	 

 */
public class PatternDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("输入一个数判断是否是手机号码");
			String phoNum = scanner.nextLine();
			if (phoNum.matches("^1[356789][0-9]{9}$")) {
				System.out.println("这是手机号");
			} else {
				System.out.println("这不是手机号");

			}
		}
	}

}

