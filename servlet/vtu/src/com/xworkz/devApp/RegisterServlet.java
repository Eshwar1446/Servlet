package com.xworkz.devApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class RegisterServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("nm");
		String fatherName = req.getParameter("fn");
		String emailId = req.getParameter("em");
		String applyingCourse = req.getParameter("ac");
		String previousCourseName = req.getParameter("pcn");
		String percentageEarned = req.getParameter("pe");
		String phoneNumber = req.getParameter("pn");
		
		PrintWriter printWriter = resp.getWriter();
		printWriter.print("<html><body bgcolor='#F8F8F8'>"+"<h1>your registeration is successfully done    </h1>:\n"+name+   "\n"  +fatherName+  "\n"  
				+emailId+  "\n"   + applyingCourse+	    "\n"   +previousCourseName+  "\n"  +percentageEarned+   "\n"  +phoneNumber +"</body</html>" );
	}

}
