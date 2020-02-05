package com.xworkz.servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FoodStreetServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		
		
		String name = req.getParameter("area");
		String stallname = req.getParameter("stallname");
		String noofItems = req.getParameter("items");
		String type = req.getParameter("type");
		
		
		ServletOutputStream outputStream = resp.getOutputStream();
		outputStream.print("thanks for visiting "+stallname);
		
	}

}
