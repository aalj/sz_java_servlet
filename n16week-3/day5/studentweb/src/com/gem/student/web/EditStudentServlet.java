package com.gem.student.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gem.student.entity.Student;
import com.gem.student.service.StudentService;

/**
 * Servlet implementation class EditStudentServlet
 */
public class EditStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1、获得要修改的是中个学生(id)
		int id = Integer.parseInt(request.getParameter("id"));
		// 2、获得学生的详细信息（Student对象）
		StudentService service = new StudentService();
		Student student = service.getStudentByID(id);
		// 3、存
		request.setAttribute("s", student);
		// 4、请求转发到edit.jsp
		request.getRequestDispatcher("/student/edit.jsp").
			forward(request, response);
	}

}
