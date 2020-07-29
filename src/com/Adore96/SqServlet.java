package com.Adore96;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet {

	public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException{
		System.out.println("SQ called");
//		PrintWriter out = res.getWriter();
//		out.println("Check");
		
//		RequestDispatcher rd = req.getRequestDispatcher("index.html");
//		rd.forward(req, res);
	}
}
