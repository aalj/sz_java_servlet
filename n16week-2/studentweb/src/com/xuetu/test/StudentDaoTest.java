/**
 * StudentTest.java
 * com.xuetu.test
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2016年1月6日 		Stone
 *
 * Copyright (c) 2016, TNT All Rights Reserved.
*/

package com.xuetu.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.xuetu.dao.StudentDao;
import com.xuetu.entity.Student;

/**
 * ClassName:StudentTest Function: StudentDao 的测试类</br>
 *
 * @author Stone
 * @version
 * @since Ver 1.1
 * @Date 2016年1月6日 上午11:23:31
 *
 * @see
 * 
 */
public class StudentDaoTest {

	public void saveText() {

		try {
			Student st = new Student();
			// "王二", sno, password, sex, polity, birthday, brief
			st.setName("王二");
			st.setPassword("258");
			st.setSno("20121596");
			st.setSex(1);
			st.setPolity(4);
			st.setBrief("hahahahahahhahaah");
			SimpleDateFormat s = new SimpleDateFormat("yy-MM-dd");
			st.setBirthday(s.parse("1992-2-12"));
			StudentDao sd = new StudentDao();
			sd.save(st);
		} catch (ParseException e) {
			e.printStackTrace();

		}

	}

	
	public void  queryById(){
		StudentDao dao = new StudentDao();
		Student studentById = dao.getStudentById(8
				);
		System.out.println(studentById.toString());
		
	}
	
	
	
	
	@Test
	public void updae() throws ParseException {
		StudentDao dao = new StudentDao();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd");
		Date date = dateFormat.parse("1992-03-27");
		Student byId = dao.getStudentById(8);
		System.out.println(byId);
		
		Student student = new Student(byId.getId(),"liangjun", "2012132018", "123456", 1, 4, date, "akjdfkjbdfkbdsfklb");
		dao.update(student);
	}

	public void querysno() {
		StudentDao dao = new StudentDao();
		Student student = dao.getStudentBySno("2012132018");
		System.out.println(student.toString());
	}

	public void del() {
		List<String> id = new ArrayList<>();
		id.add("4");
		id.add("2");
		id.add("3");
		StudentDao dao = new StudentDao();
		dao.delStudent(id);
	}

	public void limit() {
		StudentDao s = new StudentDao();
		List<Student> oagedStudents = s.getOagedStudents(1, 2);
		for (Student student : oagedStudents) {
			System.out.println(student.toString());
		}
	}

}
