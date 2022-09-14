package com.jtcindia.HiddenFormField;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
public void init(ServletConfig cfg){
	
}
public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
	res.setContentType("text/html");
	String name=req.getParameter("user_name");
    PrintWriter out=res.getWriter();
    out.println("<h1><font color='grey'>your name is:="+name+"<h1>");
    out.println("<a href='servlet2?user_name="+name+"'><font color='brown'>Go to Second Servlet</a>");
//      out.println(""
//    		  +"<form action='servlet2'>"
//    		  +"<input type='hidden' name='user_name' value='"+name+"'/>"
//    		  +"<button>Go to second servlet<button>"
//    		 
//    		  +"</form>");    
}
}
