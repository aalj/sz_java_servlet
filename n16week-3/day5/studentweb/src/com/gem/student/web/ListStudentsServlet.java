package com.gem.student.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gem.student.entity.Student;
import com.gem.student.service.StudentService;

/**
 * Servlet implementation class ListStudentsServlet
 */
public class ListStudentsServlet extends HttpServlet {
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
		final int PAGE_SIZE = 4;
		//1、获得用户输入的数据，显示第几页的学生
		String spage = request.getParameter("curPage");
		int page = 1;
		if(spage!=null) {	//默认是第一页
			page = Integer.parseInt(spage);
		}
		
		//2、从数据库中取数据
		StudentService service = new StudentService();
		List<Student> ss = service.getPagedStudents(page, PAGE_SIZE);
		int counts = service.getCount();	//总个数
		//共有多少页,每页显示的个数4有关
		int pages = 0;
		
		if(counts%PAGE_SIZE==0) {
			pages = counts/PAGE_SIZE;
		}else {
			pages = counts/PAGE_SIZE + 1;
		}
		//3、存
		request.setAttribute("students", ss);
		request.setAttribute("counts", counts);
		request.setAttribute("pages", pages);
		request.setAttribute("page", page);
		//4、转到list.jsp
		request.getRequestDispatcher("/student/list.jsp").
			forward(request, response);
		
	}

}
