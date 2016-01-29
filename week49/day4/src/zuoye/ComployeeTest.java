/**
 * ComployeeTest.java
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
/**
 * ClassName:ComployeeTest
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   view
 * @version  
 * @since    Ver 1.1
 * @Date	 2015年12月3日		下午7:44:38
 *
 * @see 	 

 */
public class ComployeeTest {

	public static void main(String[] args) {
		Complex complex = new Complex(2,6);
		Complex complex2 = new Complex(6,8);
		System.out.println("复数相加\t"+complex.add(complex2).toString());
		System.out.println("复数相减\t"+complex.sub(complex2).toString());
		System.out.println("复数相乘\t"+complex.mul(complex2).toString());
	}

}

