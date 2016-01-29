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

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.Test;

import com.xuetu.dao.StudentDao;
import com.xuetu.entity.Student;

/**
 * ClassName:StudentTest
 * Function: StudentDao 的测试类</br>
 *
 * @author   Stone
 * @version  
 * @since    Ver 1.1
 * @Date	 2016年1月6日		上午11:23:31
 *
 * @see 	 

 */
public class StudentDaoTest {
	
	public void saveText() {
		
		try {
			Student st = new Student();
			//"王二", sno, password, sex, polity, birthday, brief
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
	@Test
	public void limit(){
		StudentDao s = new StudentDao();
		List<Student> oagedStudents = s.getOagedStudents(1, 2);
		for (Student student : oagedStudents) {
			System.out.println(student.toString());
		}
	}
	
	

}

