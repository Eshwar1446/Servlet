package com.xworkz.servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/servlet")
public class Shine extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("nm");
		String emailid = req.getParameter("email");
		String phonenumber = req.getParameter("pn");
		String password = req.getParameter("pw");
		
		
		ServletOutputStream outputStream = resp.getOutputStream();
		outputStream.print("<html><body bgcolor='green'>"
				+"<h1>WELLCOME TO XWORKZ      Mr."+name+"</h1>"+"</body</html>");
	}

}
