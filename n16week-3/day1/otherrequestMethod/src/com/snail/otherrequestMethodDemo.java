package com.snail;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class otherrequestMethodDemo
 */
public class otherrequestMethodDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public otherrequestMethodDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		//request中的一些其他方法(请求行与请求头的相关方法)
		String mtthod = request.getMethod();//请求方法
		System.out.println("mtthod\t"+mtthod);
		StringBuffer url = request.getRequestURL();//请求URL
		System.out.println("url\t"+url);
		//获得请求头的名字
		Enumeration<String> headerNames = request.getHeaderNames();
		//使用迭代便利枚举
		while(headerNames.hasMoreElements()){
			System.out.println("hahah\t"+headerNames.nextElement());
			System.out.println(request.getHeader(headerNames.nextElement()));
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
