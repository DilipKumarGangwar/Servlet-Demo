//We want the square of the result after addition of 2 values by client
package com.dilip;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;



import javax.servlet.http.HttpServletRequest;

public class AddServlet extends HttpServlet {
	
	
	//This Servlets accepts   GET requests  
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException
	{
	  int i=Integer.parseInt(req.getParameter("num1"));
	  int j=Integer.parseInt(req.getParameter("num2"));
	  int k=i+j;
	  
	   
	  //Easiest method to send data to other servlet is in Request object (req) , other is via session management
	  req.setAttribute("key", k);
	  
	  
	  //To send the request to other servlet , use Dispatcher
	  
	 RequestDispatcher r =  req.getRequestDispatcher("Square");  //Check this "Square" in web.xml
	 r.forward(req, resp);
	}
	
	
	
	

}
