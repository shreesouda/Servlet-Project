package com.pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/indurl")
public class MyServlet2 extends HttpServlet {
	
	//demonstrate use of filters
	
	public void service (HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		PrintWriter pt = res.getWriter();
		pt.print("welcome to servlet " + req.getParameter("name"));
	}

}
