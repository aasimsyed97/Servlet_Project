package com.Demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet { 
	
	 public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException { 
		  
		 int k = (int) req.getAttribute("k"); 
		 
		 int sq = k*k;
		 
		PrintWriter out =  res.getWriter(); 
		out.println("Squre of number is : "+sq );
		//out.println("squre is here");
	 }

}
