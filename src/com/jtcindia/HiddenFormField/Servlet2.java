package com.jtcindia.HiddenFormField;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet{
public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
	res.setContentType("text.html");
	String name=req.getParameter("user_name");
	PrintWriter out=res.getWriter();
	out.println("<h1><font color='red'>welcome back:"+name+"<h1>");
}
}
