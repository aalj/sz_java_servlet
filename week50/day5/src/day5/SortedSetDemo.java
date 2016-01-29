/**
 * SortedSetDemo.java
 * day5
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月11日 		Stone_A
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package day5;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * ClassName:SortedSetDemo
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   Stone_A
 * @version  
 * @since    Ver 1.1
 * @Date	 2015年12月11日		上午11:25:00
 *
 * @see 	 

 */
public class SortedSetDemo {

	public static void main(String[] args) {
		SortedSet<String> ss = new  TreeSet<String>();
		SortedSet<Employee1> ss2 = new  TreeSet<Employee1>();
		ss.add("d");
		ss.add("e");
		ss.add("b");
		ss.add("g");
		ss.add("f");
		ss.add("c");
		ss.add("h");
		ss.add("a");
		ss2.add(new Employee1("13", "张三", 103));
		ss2.add(new Employee1("14", "张四", 104));
		ss2.add(new Employee1("15", "张五", 105));
		ss2.add(new Employee1("16", "张六", 106));
		ss2.add(new Employee1("17", "张七", 107));
System.out.println(ss);	
System.out.println(ss2);
		

	}

	
	
	
	

	
	

}

