package com.capg.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/show")
public class HelloController extends HttpServlet{

	@Override
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		String uName=req.getParameter("tbName");
		PrintWriter out=res.getWriter();
		out.println("Hello " +uName);
		//System.out.println("Hello "+uName);
	}
}
