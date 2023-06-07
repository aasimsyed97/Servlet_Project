package com.ufc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MaleCategory extends HttpServlet { 
	 
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {  
		
		String weight = req.getParameter("men");
		System.out.println(weight); 
		
    PrintWriter out = res.getWriter(); 
     out.println("<h1>" + weight+ "</h1>");
     
	}

}
