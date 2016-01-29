package com.snail;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShowSysTimeServlet
 */
@WebServlet("/ShowSysTimeServlet")
public class ShowSysTimeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ShowSysTimeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		System.out.println(id);
		// 获得系统的当前时间
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
		String s = dateFormat.format(date);
		// 把时间送到客户端
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.write(s);
		out.flush();
		out.close();
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
