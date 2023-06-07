package com.Demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{ 
	
	public  void service( HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {  
		
		 int i = Integer.parseInt(req.getParameter("num1"));  
		 int j = Integer.parseInt(req.getParameter("num2")); 
		 
		 int k = i+j;
		 System.out.println(k); 
		 
		 
		 /* PrintWriter object is used to print something on webpage.
		  * 
		  * */
//		PrintWriter out =  res.getWriter(); 
//		out.println("Result is :" + k);  
		 
		 
		 req.setAttribute("k", k);
		
		 /* RequestDispatcher is used to call other servlet from servlet.
		  * there are other way also such as Redirect.
		  * */
		RequestDispatcher rd = req.getRequestDispatcher("sq"); 
		rd.forward(req, res);
		
		
		
		
		 
		
		
	}
	

}
