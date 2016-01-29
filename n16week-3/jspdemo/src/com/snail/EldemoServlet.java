package com.snail;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.snail.entity.Student;

/**
 * Servlet implementation class EldemoServlet
 */
public class EldemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EldemoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter().append("Served at: ").append(request.getContextPath());
		out.println("创建成功");
		//将一些数据存到request作用域中，
		//数据类型:简单字符，一个对象：可以是对象的集合（list,数组，map）
		//将请求转发到jstl1.jsp页面
		Student stu =new Student("张三","20", "男的");
		Student stu1=new Student("张三1","201", "男的1");
		Student stu2 =new Student("张三2","202", "男的2");
		Student stu3 =new Student("张三3","203", "男的3");
		request.setAttribute("student", stu);
		String [] shuzu= {"android","java","c++"};
		Student[] stus = {stu,stu1,stu2};
		request.setAttribute("students", stus);
		request.setAttribute("code", shuzu);
		List<Student> list= new ArrayList<>();
		list.add(stu);
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
		request.setAttribute("listStu", list);
		Map<String,List> map =new HashMap<>();
		map.put("name", list);
		request.setAttribute("namemap", map);
		
		request.getRequestDispatcher("/jstl2.jsp").forward(request, response);
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
