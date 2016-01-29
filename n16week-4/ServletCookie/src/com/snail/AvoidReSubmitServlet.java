package com.snail;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AvoidReSubmitServlet
 */
public class AvoidReSubmitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AvoidReSubmitServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String hid = request.getParameter("hid");
		HttpSession session = request.getSession();
		String sid = (String)session.getAttribute("sid");
		if(hid!=null&&sid!=null&&hid.equals(sid)){
			System.out.println("第一次提交");
			session.removeAttribute("sid");
		}else{
			
			System.out.println("已经提交过一次");
		}
		System.out.println("sevlet:   "+sid);
		System.out.println("para");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
