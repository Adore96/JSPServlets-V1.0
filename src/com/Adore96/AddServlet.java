package com.Adore96;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AddServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req , HttpServletResponse res) throws IOException, ServletException {
		
		int i = Integer.parseInt(req.getParameter("num1")) ;
		int j = Integer.parseInt(req.getParameter("num2")) ;
		
		int k = i+j;
		int l = i/j;
		int m = i*j;
		int n = Math.abs(i-j);
		
		PrintWriter out= res.getWriter();
		
		out.println("Addition is :"+ k);
		out.println("Substraction is :"+ n);
		out.println("Devision is :"+ l);
		out.println("Multiplication is :"+ m);
		
	

		
//		RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
//		rd.forward(req, res);
		
		
		
		
		
	}
	
}
