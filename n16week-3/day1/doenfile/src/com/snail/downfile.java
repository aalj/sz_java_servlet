package com.snail;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.OutputBuffer;

/**
 * Servlet implementation class downfile
 */
public class downfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public downfile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		//实现文件下载
		//设置文档类型
		response.setContentType("application/x-download");
		//设置相应头Content-Disposition
		response.setHeader("Content-Disposition", "attachment;fiflename=xx.pptx");
		
		//文件拷贝,
		FileInputStream in= new FileInputStream(this.getServletContext().getRealPath("2.pptx"));
		OutputStream out = response.getOutputStream();
		byte[] buf = new byte[1024];
		int i = 0;
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
