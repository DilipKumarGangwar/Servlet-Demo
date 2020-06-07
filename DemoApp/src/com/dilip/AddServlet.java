package com.dilip;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;

public class AddServlet extends HttpServlet {
	
	
	//Servlets accepts  both GET  and POST  requests  
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException
	{
	  int i=Integer.parseInt(req.getParameter("num1"));
	  int j=Integer.parseInt(req.getParameter("num2"));
	  int k=i+j;
	  
	 // System.out.println("Result id ="+ k);    //Print response on console
	  //PrintWriter: prints text data to a character stream. 
	  //getWriter :Returns a PrintWriter object that can send character text to the client.
	  
	  PrintWriter printWriter = resp.getWriter();
	  printWriter.println("Result of addition="+k);         //Print response on Browser
	  
	  
	}
	
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException
	{
	  int i=Integer.parseInt(req.getParameter("num1"));
	  int j=Integer.parseInt(req.getParameter("num2"));
	  int k=i+j;
	  
	 // System.out.println("Result id ="+ k);    //Print response on console
	  //PrintWriter: prints text data to a character stream. 
	  //getWriter :Returns a PrintWriter object that can send character text to the client.
	  
	  PrintWriter printWriter = resp.getWriter();
	  printWriter.println("Result of addition="+k);         //Print response on Browser
	  
	  
	}
	
	

}
