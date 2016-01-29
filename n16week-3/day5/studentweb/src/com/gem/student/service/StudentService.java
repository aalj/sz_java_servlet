package com.gem.student.service;

import java.util.List;

import com.gem.student.dao.StudentDao;
import com.gem.student.entity.Student;

public class StudentService {
	private StudentDao dao = new StudentDao();
	
	//方法，判断学号与密码是否正确
	public boolean  canLogin(String sno,String pwd) {
		//找出sno的学生,判断这个学生的密码与pwd是否相等
		if(dao.getStudentBySno(sno)==null) return false;
		return dao.getStudentBySno(sno).getPwd().equals(pwd);
	}
	
	//保存学生对象
	public void save(Student student) {
		//
		dao.save(student);
	}
	
	//删除选中的学生
	public void deletes(String[] ids) {
		
	}
	
	//
	public List<Student> getAll() {
		return dao.getAll();
	}
	
	public int getCount() {
		return dao.getCount();
	}
	//分页查询的方法
	public List<Student> getPagedStudents(int curPage,int pageSize) {
		return dao.getPagedStudents(curPage, pageSize);
	}
	
	public Student getStudentByID(int id) {
		return dao.getStudentByID(id);
	}
	
	
	
	
}
