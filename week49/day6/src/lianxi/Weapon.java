/**
 * Weapon.java
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
 * ClassName:Weapon
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   Stone_A
 * @version  
 * @since    Ver 1.1
 * @Date	 2015年12月5日		下午10:52:38
 *
 * @see 	 

 */
public interface Weapon {
	/**
	 * 
	 * setSoldier:(该方法表示设置武器的使用者)
	 *
	 * @param  @param s    设定文件
	 * @return void    DOM对象
	 * @throws 
	 * @since  CodingExample　Ver 1.1
	 */
	void setSoldier(Soldier s);
	/**
	 * 
	 * fire:(该方法的返回值表示战士使用该武器时，对敌人的伤害值)
	 * <p>
	 *
	 * @param  @return    设定文件
	 * @return int    DOM对象
	 * @throws 
	 * @since  CodingExample　Ver 1.1
	 */
	int fire();

}



