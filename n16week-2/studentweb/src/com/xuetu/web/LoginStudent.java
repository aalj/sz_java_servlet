package com.xuetu.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xuetu.dao.StudentDao;
import com.xuetu.entity.Student;

/**
 * Servlet implementation class LoginStudent
 */
public class LoginStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setCharacterEncoding("utf-8");
//		String CONTENT_TYPE = "text/html; charset=utf-8";
//		response.setContentType(CONTENT_TYPE);
		PrintWriter out = response.getWriter().append("Served at: ").append(request.getContextPath());
		String stunum = request.getParameter("stuentNumber");
		String pwd = request.getParameter("password");
		StudentDao dao = new StudentDao();
		Student student = dao.getStudentBySno(stunum);
		System.out.println("student.getPassword()\t"+student.getPassword());
		System.out.println("pwd\t"+stunum);
		if (pwd.equals(student.getPassword())) {
			out.println("登录成功");
		} else {
			out.println("帐号密码不正确");
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);

	}

}
