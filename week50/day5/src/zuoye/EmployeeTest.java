/**
 * EmployeeTest.java
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
/*
 * 有一个Employee类，其中有如下属性
    private int age;
	private String name;
    private String eno;
	private double salary;
	实现Employee类，要求
	1）具有无参的构造函数
	2）具有Employee(int age，String name,double salary)构造函数
	3）重写toString方法，显示员工的姓名、年龄、薪水

 */
/**
 * ClassName:EmployeeTest
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   Stone_A
 * @version  
 * @since    Ver 1.1
 * @Date	 2015年12月12日		上午9:05:03
 *
 * @see 	 

 */
public class EmployeeTest {

	public static void main(String[] args) {
		System.out.println("测试员工类的toString方法");
		Employee employee = new Employee( "张三",45,5000);
		System.out.println(employee.toString());
	}

}