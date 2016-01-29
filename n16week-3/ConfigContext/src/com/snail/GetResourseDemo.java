package com.snail;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URL;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetResourseDemo
 */
public class GetResourseDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetResourseDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.setContentType("utf-8");
		response.setHeader("Content-Type", "text/html;charset=utf-8");
		response.setCharacterEncoding("utf-8");
		ServletContext context = this.getServletContext();
		String realPath = context.getRealPath("/");
		String contextPath = context
		.getContextPath();
		PrintWriter out = response.getWriter();
		InputStream ll = context.getResourceAsStream("不开心.png");
		out.println(realPath+"\n");
		
		out.println(contextPath+"\n");
//		out.println(ll.toString());
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
