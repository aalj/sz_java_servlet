package com.xuetu.web;

import java.awt.Frame;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xuetu.dao.StudentDao;
import com.xuetu.entity.Student;

/**
 * Servlet implementation class ListStudent
 */
public class ListStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int PAGENUM=5;
		response.setContentType("test/html;charset=utf-8");
		String t=request.getParameter("curPage");
		int pg= 1;
		if(t!=null){
			pg=Integer.parseInt(t);
//			System.out.println(pg);
		}
		StudentDao dao = new StudentDao();
		//查询数据表的记录条数
		int count = dao.getCount();
		System.out.println(count);
		
		List<Student> listStu = dao.getOagedStudents(pg,PAGENUM);
		//计算具有多少也数据
		int pagenum = 0;
		
		if(count%2==0){
		pagenum=count/PAGENUM;
		}else{
			pagenum=count/PAGENUM+1;
		}
		request.setAttribute("pageNum", pagenum);
		request.setAttribute("limitStudnet", listStu);
		request.setAttribute("num", count);
		request.setAttribute("page", pg);
		if(pg>pagenum){
			PrintWriter out = response.getWriter();
			
		}
		request.getRequestDispatcher("/list.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
