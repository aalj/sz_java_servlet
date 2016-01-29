/**
 * BlackStick.java
 * lianxi
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月5日 		Stone_A
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package lianxi;

/**
 * ClassName:BlackStick Function: TODO ADD FUNCTION Reason: TODO ADD REASON
 *
 * @author Stone_A
 * @version
 * @since Ver 1.1
 * @Date 2015年12月5日 下午10:40:51
 *
 * @see
 * 
 */
public class BlackStick implements MagicStick {
	int mon = 0;

	public BlackStick(int mon) {
		this.mon = mon;

	}

	@Override
	public int fire() {
		if(mon%2==0){
			return 2;
		}
		return 1;

	}

}
