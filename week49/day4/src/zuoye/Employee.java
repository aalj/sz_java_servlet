/**
 * Employee.java
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

public class Employee {
	/*
	 * 1) 为Employee类添加三个属性， a）String 类型的name，表示员工姓名； b）int 类型的age，表示员工年龄；
	 * c）double 类型的salary，表示员工工资。 2) 为Employee类添加两个构造方法，
	 * a）公开无参构造方法；在无参构造方法中，用this调用有参构造方法， name=”无名”，age=20, salary=8000
	 * b）接受三个参数的构造方法，三个参数分别为字符串、int 和double 类型。 3) 为Employee 类添加两个work 方法，
	 * 一个无参，显示员工在工作， 另一个带整数参数，表示员工工作的时间（为多少小时），方法显示员工工作了多少小时。
	 * 4）为该类的属性增加get/set方法 5）在main方法中，创建两个员工对象： Zhang3 30 2000 Wang4 35 3500
	 * 并分别调用带参的及不参的work方法。
	 */
	private String name = null;
	private int age = 0;
	private double salary = 0;

	public Employee() {

		this("无名", 20, 8000);

	}

	public Employee(String name, int age, double salary) {

		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		this.work();
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void work() {
		System.out.println("员工在工作");

	}

	public double work(double time) {
		return time;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
}
