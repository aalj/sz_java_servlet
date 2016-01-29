/**
 * EmployeeSet.java
 * zuoye
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月12日 		Stone_A
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package zuoye;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * ClassName:EmployeeSet Function: TODO ADD FUNCTION Reason: TODO ADD REASON
 *
 * @author Stone_A
 * @version
 * @since Ver 1.1
 * @Date 2015年12月12日 上午9:17:56
 *
 * @see
 * 
 */
public class EmployeeSet {

	public static void main(String[] args) {
		Set<Employee> set = new HashSet<>();
		set.add(new Employee("zhang3", 18, 3000));
		set.add(new Employee("li4", 25, 3500));
		set.add(new Employee("wang5", 22, 3200));
		set.add(new Employee("wang5", 22, 6500));
		System.out.println(set.size());

		System.out.println("Set集合中有3个元素,通过重写equals以后,名字年龄一样的的表示一个人");
		System.out.println("for-each 遍历");
		for (Employee employee : set) {
			System.out.println(employee.toString());
		}
		System.out.println("iterator遍历");
		Iterator<Employee> iterator = set.iterator();
		while (iterator.hasNext()){
			System.out.println(iterator.next().toString());
		}
	}

}
