/**
 * Employee.java
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

/**
 * ClassName:Employee Function: TODO ADD FUNCTION Reason: TODO ADD REASON
 *
 * @author Stone_A
 * @version
 * @since Ver 1.1
 * @Date 2015年12月11日 上午10:53:11
 *
 * @see
 * 
 */
public class Employee1 implements Comparable<Employee1>{
	/**
	 * 员工号
	 */
	private String eno;
	private String name;
	private int salary;

	public Employee1(String eno, String name, int salary) {
		super();
		this.eno = eno;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", name=" + name + ", salary=" + salary + "]";
	}

	public String getEno() {
		return eno;
	}

	public void setEno(String eno) {
		this.eno = eno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public int compareTo(Employee1 o) {
		//代码中验证O是Employee类型
		//比较的是当前对象this 与传过来的对象o比较
		//this<o 返回复数 -1
		//this= o相等
		//this>o 整数 1
		
		//确定:排序规则只能员工编号排序
		//则认为是同一个员工
		
		return this.getEno().compareTo(o.eno);
		
	}

	
}
