package com.ufc;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MaleCategory extends HttpServlet { 
	 
	public void service(HttpServletRequest req, HttpServletResponse res) {  
		
		String weight = req.getParameter("men");
		System.out.println(weight);
	}

}
