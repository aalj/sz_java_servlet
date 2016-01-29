/**
 * Student.java
 * day11
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年12月14日 		Stone_A
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package day11;

import java.util.Date;

/**
 * ClassName:Student Function: TODO ADD FUNCTION Reason: TODO ADD REASON
 *
 * @author Stone_A
 * @version
 * @since Ver 1.1
 * @Date 2015年12月14日 下午2:43:53
 *
 * @see
 * 
 */
public class Student implements Comparable<Student>{
	private String name;
	private Date age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getAge() {
		return age;
	}
	public void setAge(Date age) {
		this.age = age;
	}
	public Student(String name, Date date) {
		super();
		this.name = name;
		this.age = date;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Student o) {
		
		
		return age.compareTo(o.getAge());
		
	}

}
