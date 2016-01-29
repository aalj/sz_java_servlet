/**
 * EmployeeSet.java
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

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/**
 * ClassName:EmployeeSet Function: TODO ADD FUNCTION Reason: TODO ADD REASON
 *
 * @author Stone_A
 * @version
 * @since Ver 1.1
 * @Date 2015年12月11日 上午10:55:58
 *
 * @see
 * 
 */
public class EmployeeSet {
	static // static Set<Employee> employeeSet = new HashSet<Employee>();
	List<Employee1> employeeSet = new ArrayList<Employee1>();

	public static void main(String[] args) {
		employeeSet.add(new Employee1("13", "张三", 103));
		employeeSet.add(new Employee1("14", "张四", 104));
		employeeSet.add(new Employee1("15", "张五", 105));
		employeeSet.add(new Employee1("16", "张六", 106));
		employeeSet.add(new Employee1("17", "张七", 107));
		System.out.println();
		System.out.println("普通for方法");
		System.out.println();
		for (int i = 0; i < employeeSet.size(); i++) {
			System.out.println(employeeSet.get(i).toString());
		}
		System.out.println();
		System.out.println("for-each");
		System.out.println();
		for (Employee1 string : employeeSet) {
			System.out.println(string.toString());
		}
		System.out.println();
		System.out.println("迭代器");
		System.out.println();

		Iterator<Employee1> iterator = employeeSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
		System.out.println();
		System.out.println("ListIterator方法");
		System.out.println();
		
		ListIterator<Employee1> listIterator = employeeSet.listIterator(employeeSet.size());
		while (listIterator.hasPrevious()) {
			Employee1 previous = listIterator.next();
			System.out.println(previous.toString());

		}
	}

}
