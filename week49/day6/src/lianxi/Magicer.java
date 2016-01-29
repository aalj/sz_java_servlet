/**
 * Magicer.java
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
 * ClassName:Magicer Function: TODO ADD FUNCTION Reason: TODO ADD REASON
 *
 * @author Stone_A
 * @version
 * @since Ver 1.1
 * @Date 2015年12月5日 下午10:44:13
 *
 * @see
 * 
 */
public class Magicer extends NamedRole {
	int level = 1;
	MagicStick  stick = null;
	public Magicer(int level) {
		this.level = level;

	}


	@Override
	public int attack() {
		
		return 5*level;

	}

	@Override
	public void practise() {
		if(stick == null){
			level++;
		}else {
			if(level == level + 1 + stick.fire()){
				level = 1+stick.fire();
			}
		}
	}

}
