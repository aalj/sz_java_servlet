package com.gem.student.web;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gem.student.entity.Student;
import com.gem.student.service.StudentService;

/**
 * Servlet implementation class AddStudentServlet
 */
public class AddStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//写调用doPost
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		//1、获得：用户输入的数据
		String name = request.getParameter("stuName");
		String sno = request.getParameter("stuNumber");
		String pwd = request.getParameter("stuPassword");
		String birthday = request.getParameter("stuBirthday");
		String sex = request.getParameter("stuSex");
		String polity = request.getParameter("stuPolity");
		String brief = request.getParameter("stuBrief");
		//测试：
		System.out.println(name+","+sno+","+pwd+","+birthday+
				","+sex+","+polity+","+brief);
		//2、组装到一个学生对象中
		Student s = new Student();
		
		s.setName(name);
		s.setSno(sno);
		s.setPwd(pwd);
	
		s.setSex(Integer.parseInt(sex));
		s.setPolity(Integer.parseInt(polity));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			s.setBirthday(sdf.parse(birthday));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		s.setBrief(brief);
		
		//3、调用Service中的方法，保存学生对象
		StudentService service= new StudentService();
		service.save(s);
		System.out.println("ok");
		
	}

}
