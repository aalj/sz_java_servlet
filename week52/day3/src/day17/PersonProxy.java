/**
 * PersonProxy.java
 * day17
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月23日 		liang
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package day17;
/**
 * ClassName:PersonProxy
 * Function: 代理人
 * Reason:	 TODO ADD REASON
 *
 * @author   liang
 * @version  
 * @since    Ver 1.1
 * @Date	 2015年12月23日		下午2:00:21
 *
 * @see 	 

 */
public class PersonProxy {
	//要代理的人
	Person p= new  PersonImpl();
	//提供一个和eating方法一样的签名的方法
	public void eating(){
		p.eating();
	}
	
	
	public static void main(String[] args) {
		PersonProxy personProxy = new PersonProxy();
		System.out.println("吃饭要付费");
		personProxy.eating();
	}
}

