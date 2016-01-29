package com.xuetu.web;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xuetu.dao.StudentDao;
import com.xuetu.entity.Student;

/**
 * Servlet implementation class AddStudentServlet
 */
public class AddStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 获得输入的内容
		request.setCharacterEncoding("UTF-8");
		System.out.println("ok");
		Student s = new Student();
		  try {
			s.setName(request.getParameter("stuName"));
			  s.setSno(request.getParameter("stuNumber"));
			  s.setPassword(request.getParameter("stuPassword"));
			 s.setSex(Integer.parseInt(request.getParameter("stuSex")));
			 s.setPolity(Integer.parseInt(request.getParameter("stuPolity")));
			String date = request.getParameter("stuBirthday");
			SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd");
			 s.setBirthday(dateFormat.parse(date));
			s.setBrief(request.getParameter("stuBrief"));
			
//			System.out.println(name+"\t"+sno+
//					"\t"+password+"\t"+sex+
//					"\t"+polity+"\t"+date+"\t"+birthday );
			StudentDao dao = new StudentDao();
			dao.save(s);
			System.out.println("ok");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
//		response.sendRedirect("/studentweb/AddStudentServlet");
		
		
	}

}
