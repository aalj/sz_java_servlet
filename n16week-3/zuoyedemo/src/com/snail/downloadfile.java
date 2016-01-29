package com.snail;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class downloadfile
 */
public class downloadfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public downloadfile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		//设置文档类型
		response.setContentType("application/x-download");
		//设置相应的相应的头
		response.setHeader("Content-Disposition", "attachment;filename="+URLEncoder.encode("美女.rar", "utf-8"));
//		response.setHeader("Content-Disposition", "attachment;filename=中文的.rar");
//		FileInputStream in= new FileInputStream(this.getServletContext().getRealPath("a.rar"));
		System.out.println(this.getServletContext().getRealPath("/中文的.rar"));
		File fe= new File(this.getServletContext().getRealPath("/中文的.rar"));
		InputStream in = new FileInputStream(fe);
		byte[] buf= new byte[1024];
		int i = 0;
		OutputStream out = response.getOutputStream();
		
		while((i=in.read(buf))!=-1){
			out.write(buf,0,i);
		}
		in.close();
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
