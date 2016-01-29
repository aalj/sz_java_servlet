/**
 * LinkeHashMapTest.java
 * test
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月13日 		Stone_A
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * ClassName:LinkeHashMapTest
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   Stone_A
 * @version  
 * @since    Ver 1.1
 * @Date	 2015年12月13日		下午2:24:14
 *
 * @see 	 

 */
public class LinkeHashMapTest {

	public static void main(String[] args) {
		LinkedHashMap s = new LinkedHashMap();
		s.put("语文", 80);
		s.put("数学", 82);
		s.put("英语", 79);
		s.forEach((key,value)->System.out.println(key+" \t"+value));
		

	}

}

