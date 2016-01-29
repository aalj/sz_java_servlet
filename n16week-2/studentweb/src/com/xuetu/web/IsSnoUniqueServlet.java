package com.xuetu.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xuetu.service.StudentService;

/**
 * Servlet implementation class IsSnoUniqueServlet
 */
public class IsSnoUniqueServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public IsSnoUniqueServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 获得要判断学生的学号
		String sno = request.getParameter("sno");
		System.out.println(sno);
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		if (sno != null) {
			System.out.println(new StudentService().isSnoUnique(sno));
			if (new StudentService().isSnoUnique(sno)) {
				// 获得要判断你的血色好难过的学号
				// 如果学号唯一返回"1",学号不唯一返回"0"
				out.write("1");
			} else {
				out.write("0");

			}

		}
		
		out.flush();
		out.close();
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
