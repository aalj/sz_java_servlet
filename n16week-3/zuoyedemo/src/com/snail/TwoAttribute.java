package com.snail;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TwoAttribute
 */
public class TwoAttribute extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TwoAttribute() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter append = response.getWriter().append("Served at: ").append(request.getContextPath());
		this.getServletContext().setAttribute("key", "twoAttribute");
		//第一种方方法重定向
//		response.sendRedirect("/zuoyedemo/MyAttribute");
		//第二种方法设置重定向
//		response.setStatus(HttpServletResponse.SC_MOVED_TEMPORARILY);
//		response.setHeader("Location", "/zuoyedemo/MyAttribute");
		//第三种设置重定向的的方法
		response.setHeader("refresh", "3,url=/zuoyedemo/MyAttribute");
		
		append.println("TwoAttribute");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
