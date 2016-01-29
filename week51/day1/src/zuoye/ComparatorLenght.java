/**
 * ComparatorLenght.java
 * zuoye
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月14日 		Stone_A
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package zuoye;

import java.util.Comparator;

/**
 * ClassName:ComparatorLenght
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   Stone_A
 * @version  
 * @since    Ver 1.1
 * @Date	 2015年12月14日		下午6:02:18
 *
 * @see 	 

 */
public class ComparatorLenght implements Comparable<ComparatorLenght >{
	
	private String name ;
	@Override
	public int compareTo(ComparatorLenght o) {
		
		
		return name.length()-o.getName().length();
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	@Override
	public String toString() {
		return "ComparatorLenght [name=" + name + "]";
	}
		
	
	

}

