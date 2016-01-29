package com.snail;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//1.获得用户名密码
		String checked = request.getParameter("autologin");
		System.out.println("checked"+checked);
		String username = request.getParameter("username");
		String pwd = request.getParameter("pwd");
		System.out.println(pwd);
		//2. 判断用户名密码是否匹配
		if(username.equals("tom")&&pwd.equals("12345")){
			if ("1".equals(checked)) {
				System.out.println();
				Cookie cookie = new Cookie("info", username+","+pwd);
				cookie.setMaxAge(60*60);
				response.addCookie(cookie);
			}
			response.sendRedirect("/ServletCookie/success.jsp");
		}else{
			request.getRequestDispatcher("/login.jsp").forward(request, response);
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
