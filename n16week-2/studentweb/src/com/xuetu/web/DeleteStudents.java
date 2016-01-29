package com.xuetu.web;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xuetu.dao.StudentDao;

/**
 * Servlet implementation class DeleteStudents
 */
public class DeleteStudents extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		response.getWriter().append("Served at: ").append(request.getContextPath());
		// 1.获得数据,要删除的学生
		request.getParameter("");
		// 2.调用StudentService中相应的方法
		String[] parameterValues = request.getParameterValues("chkStudent");

		for (String string : parameterValues) {
			System.out.println(string);
		}
		StudentDao dao = new StudentDao();
		List list = Arrays.asList(parameterValues);
		
		dao.delStudent(list);
		
		request.getRequestDispatcher("/studentweb/ListStudent").forward(request, response);

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
