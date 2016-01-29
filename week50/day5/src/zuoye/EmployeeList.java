/**
 * EmployeeList.java
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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * 在上题的基础上
	1) 创建一个List，在List 中增加如下员工对象，基本信息如下：
		姓名 年龄 工资
		zhang3 18 3000
		li4 25 3500
		wang5 22 3200
    	wang5 22 6200
	2) 在li4 之前插入一个工人，信息为：姓名：zhao6，年龄：24，工资3300
	3) 删除wang5 的信息
	4) 利用for-each 循环遍历，打印List 中所有员工的信息
	5) 利用一般for 循环遍历，打印List 中所有员工的信息
	6) 利用迭代（Iterator）遍历，打印List 中所有员工的信息。

 */
/**
 * ClassName:EmployeeList
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   Stone_A
 * @version  
 * @since    Ver 1.1
 * @Date	 2015年12月12日		上午9:09:34
 *
 * @see 	 

 */
public class EmployeeList {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("zhang3" ,18, 3000));
		list.add(new Employee("li4" ,25, 3500));
		list.add(new Employee("wang5" ,22, 3200));
		list.add(new Employee("wang5" ,22, 6500));
		
		System.out.println("在li4 之前插入一个工人，信息为：姓名：zhao6，年龄：24，工资3300");
		System.out.println("利用for-each 循环遍历");
		list.add(1,new Employee("zhao6", 24, 3300));
		for (Employee employee : list) {
			System.out.println(employee.toString());
		}
		System.out.println("删除wang5 的信息");
		System.out.println("利用一般for 循环遍历");
		list.remove(3);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
		
		System.out.println("利用迭代（Iterator）遍历");
		Iterator<Employee> iterator = list.iterator();
		while (iterator.hasNext()) {
			Employee next = iterator.next();
			System.out.println(next.toString());
		}
		
		

	}

}

