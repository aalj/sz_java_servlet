package com.gem.student.dao.test;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.Test;

import com.gem.student.dao.StudentDao;
import com.gem.student.entity.Student;

//是StudentDao的测试类
public class StudentDaoTest {
	@Test
	public void saveTest() throws ClassNotFoundException, SQLException, IOException, ParseException {
		//测试StudentDao中的save方法
		StudentDao dao = new StudentDao();
		//创建要保存的学生对象
		Student s = new Student();
		//set方法设置s的属性
		s.setName("li4");
		s.setSno("114");
		s.setPwd("321");
		s.setSex(1);
		s.setPolity(4);
		SimpleDateFormat sdf = 
				new SimpleDateFormat("yyyy-MM-dd");
		s.setBirthday(sdf.parse("1999-9-9"));
		s.setBrief("love html5");
		//
		dao.save(s);
	}
	
	@Test
	public void getStudentByIdTest() throws ClassNotFoundException, SQLException, IOException {
		//测试StudentDao中的save方法
		StudentDao dao = new StudentDao();
		Student s = dao.getStudentByID(56);
		System.out.println(s.getSno()+","+s.getName()+","+s.getSex());
	}
	
	@Test
	public void deleteTest() {
		StudentDao dao = new StudentDao();
		dao.delete(new int[]{13,5,29,8,23});
	}
	
	@Test
	public void getPagedStudentsTest() {
		StudentDao dao = new StudentDao();
		List<Student> students = dao.getPagedStudents(2, 5);
		for(Student s:students) {
			System.out.println(s.getId()+","+s.getName()+","+s.getSno());
		}
	}
	@Test
	public void getCountTest() {
		System.out.println(new StudentDao().getCount());
	}
	
	
}
