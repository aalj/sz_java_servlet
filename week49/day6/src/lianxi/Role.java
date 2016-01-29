/**
 * Role.java
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
 * ClassName:Role
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   Stone_A
 * @version  
 * @since    Ver 1.1
 * @Date	 2015年12月5日		下午10:29:39
 *
 * @see 	 

 */
public interface Role {
	/**
	 * 
	 * attack:(表示攻击，)
	 * <p>
	 *
	 * @param  
	 * @return 表示对敌人的伤害
	 * @return int    DOM对象
	 * @throws 
	 * @since  CodingExample　Ver 1.1
	 */
	 public int attack() ;
	 
	 /**
	  * 
	  * practise:(表示练习)
	  *
	  * @param      设定文件
	  * @return void    练习之后对敌人的伤害会增加
	  * @throws 
	  * @since  CodingExample　Ver 1.1
	  */
	 public void practise();

}


