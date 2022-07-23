package com.pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	
	//to demnstrate servletcontext & servletconfg.
	
	public void service (HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		PrintWriter pt = res.getWriter();
		pt.println("Hi bro!");
		
		ServletConfig scont = getServletConfig();
		String s = scont.getInitParameter("name");
		pt.println(s);
		
		ServletContext sc = getServletContext();
		pt.print(sc.getInitParameter("name1") + sc.getInitParameter("name2"));
		
	}

}
