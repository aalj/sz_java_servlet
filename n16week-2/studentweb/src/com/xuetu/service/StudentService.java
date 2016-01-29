/**
 * StudentService.java
 * com.xuetu.service
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2016年1月7日 		Stone
 *
 * Copyright (c) 2016, TNT All Rights Reserved.
*/

package com.xuetu.service;

import com.xuetu.dao.StudentDao;
import com.xuetu.entity.Student;

/**
 * ClassName:StudentService
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   Stone
 * @version  
 * @since    Ver 1.1
 * @Date	 2016年1月7日		上午8:50:59
 *
 * @see 	 

 */
public class StudentService {
	private StudentDao dao= new StudentDao();
	/**
	 * 
	 * canLogin:(用来判断学好和密码是否正确)<br/>
	 * (本身是不需要数据的)<br/>
	 *
	 * @param  @param sno
	 * @param  @param pwd
	 * @param  @return    设定文件
	 * @return boolean    DOM对象
	 * @throws 
	 * @since  CodingExample　Ver 1.1
	 */

	public boolean canLogin(String sno ,String pwd){
		//找出三农学生，判断这个学生的密码与pwd是否相等
		Student student = dao.getStudentBySno(sno);
		return false;
	}
	
	
	public void save(Student student){
		dao.save(student);
	}
	/**
	 * 
	 * delStudents:(删除学生组)<br/>
	 * @param      设定文件
	 * @return void    DOM对象
	 * @throws 
	 * @since  CodingExample　Ver 1.1
	 */
	public void delStudents(){
		//TODO
	}

	/**
	 * 
	 * isSnoUnique:(判断这个学生是否存在)<br/>
	 *
	 * @param   sno
	 * @param      设定文件
	 * @return boolean    true 表示学生存在  false  表示学生不存在
	 * @throws 
	 * @since  CodingExample　Ver 1.1
	 */
	public boolean isSnoUnique(String sno) {
		StudentDao dao = new StudentDao();
		Student student = dao.getStudentBySno(sno);
		System.out.println("student.getId()-------"+student.getId());
		if(student.getId()!=0){
			return true;
		}else{
			return false;
			
		}
		
		
	}
	
}
