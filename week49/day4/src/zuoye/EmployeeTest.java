/**
 * EmployeeTest.java
 * zuoye
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月3日 		view
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package zuoye;
/**
 * ClassName:EmployeeTest
 * Function: 雇员的测试类
 * Reason:	 TODO ADD REASON
 *
 * @author   view
 * @version  
 * @since    Ver 1.1
 * @Date	 2015年12月3日		下午4:26:59
 *
 * @see 	 

 */
public class EmployeeTest {

	public static void main(String[] args) {
		/*
		 * 	Zhang3  30  2000
		Wang4   35  3500
		 */
		Employee e1= new Employee("Zhang3",  30,  2000);
		Employee e2= new Employee("wang3",  35,  3500);
		System.out.println("雇员e1"+e1.toString());
		System.out.println("雇员e2"+e2.toString());
		e1.work();
		System.out.println("e2雇员已经工作"+e2.work(5)+"小时");
	}

}

