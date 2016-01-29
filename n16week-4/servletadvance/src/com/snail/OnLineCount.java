/**
 * OnLineCount.java
 * com.snail
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2016年1月26日 		Stone
 *
 * Copyright (c) 2016, TNT All Rights Reserved.
*/

package com.snail;

/**
 * ClassName:OnLineCount<br/>
 * Function: TODO ADD FUNCTION<br/>
 * Reason: TODO ADD REASON<br/>
 *
 * @author Stone
 * @version
 * @since Ver 1.1
 * @Date 2016年1月26日 上午10:57:10
 *
 * @see
 * 
 */
public class OnLineCount {
	private static int count = 0;
	
	public static int add(){
		return count++;
	}
	public static int getCount() {
		return count;
	}
	public static int dec(){
		return count--;
	}

}
