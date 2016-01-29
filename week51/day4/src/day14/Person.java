/**
 * Person.java
 * day14
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月17日 		Stone_A
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package day14;

import java.io.Serializable;

/**
 * ClassName:Person
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   Stone_A
 * @version  
 * @since    Ver 1.1
 * @Date	 2015年12月17日		上午10:20:14
 *
 * @see 	 

 */
public class Person implements Serializable{
	private String name;
	private transient String pwd;
	public String getName() {
		return name;
	}
	public Person(String name, String pwd) {
		this.name = name;
		this.pwd = pwd;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}

