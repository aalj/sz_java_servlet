/**
 * BigDecimal.java
 * day4
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月9日 		Stone_A
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package day3;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * ClassName:BigDecimal
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   Stone_A
 * @version  
 * @since    Ver 1.1
 * @Date	 2015年12月9日		上午9:49:01
 *
 * @see 	 

 */
public class BigDecimalDemo {

	public static void main(String[] args) {
		BigDecimal bigDecimal = new BigDecimal("0.5");
		BigDecimal bigDecimal2 = BigDecimal.valueOf(0.2);
		System.out.println(bigDecimal);
		System.out.println(bigDecimal2);
		
		double a= 5.6;
		System.out.println(Math.floor(a));

	}

}

