/**
 * Primer.java
 * gem.day4
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月3日 		view
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package gem.day4;

/**
 * ClassName:Primer Function: 判断某一个数是否是素数 Reason: TODO ADD REASON
 *
 * @author view
 * @version
 * @since Ver 1.1
 * @Date 2015年12月3日 上午11:16:30
 *
 * @see
 * 
 */
public class Primer {

	public boolean isPrimer(int num) {

		for (int i = 2; i <= (int)Math.sqrt(num); i++) {
			if (num%i==0) {
				return false;
			}
		}
		
		
		return true;
	}
}
