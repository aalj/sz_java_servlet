/**
 * Student.java
 * com.xuetu.entity
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2016年1月6日 		Stone
 *
 * Copyright (c) 2016, TNT All Rights Reserved.
*/

package com.xuetu.entity;

import java.util.Date;

/**
 * ClassName:Student
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   Stone
 * @version  
 * @since    Ver 1.1
 * @Date	 2016年1月6日		上午10:32:48
 *
 * @see 	 

 */
public class Student {
	private int id;
	private String name;
	private String sno;
	private String password;
	private int sex;
	private int polity;
	private Date birthday;
	private String brief;
	public Student() {

		// 

	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", sno=" + sno + ", password=" + password + ", sex=" + sex
				+ ", polity=" + polity + ", birthday=" + birthday + ", brief=" + brief + "]";
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getPolity() {
		return polity;
	}
	public Student(int id, String name, String sno, String password, int sex, int polity, Date birthday, String brief) {
		super();
		this.id = id;
		this.name = name;
		this.sno = sno;
		this.password = password;
		this.sex = sex;
		this.polity = polity;
		this.birthday = birthday;
		this.brief = brief;
	}
	public void setPolity(int polity) {
		this.polity = polity;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}

}

