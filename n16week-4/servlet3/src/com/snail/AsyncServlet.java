package com.snail;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.scenario.effect.impl.prism.PrImage;

/**
 * Servlet implementation class AsyncServlet
 */
@WebServlet(asyncSupported=true, urlPatterns={"/AsyncServlet","/xyz/*"})
public class AsyncServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AsyncServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("异步处理开始<br/>");
		System.out.println("异步处理开始");
		AsyncContext async = request.startAsync(request, response);
		async.start(new Runnable() {
			
			@Override
			public void run() {
				
				try {
					out.println("重活。。。。。。<br/>");
					System.out.println("重活。。。。。。");
					Thread.sleep(1000);
					out.println("粗活。。。。。。<br/>");
					System.out.println("粗活。。。。。。");
					out.flush();
				} catch (InterruptedException e) {
					
					//
					e.printStackTrace();
					
				}
				
				
			}
		});
		
		
				

		out.print("异步处理结束<br/>");
		System.out.println("异步处理结束");
		out.flush();
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
