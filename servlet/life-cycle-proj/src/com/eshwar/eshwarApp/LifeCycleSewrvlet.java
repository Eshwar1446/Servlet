   package com.eshwar.eshwarApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
/*@WebServlet(urlPatterns="/lifeCycle", loadOnStartup=1, initParams= {
		@WebInitParam(name="Jingalala", value="ulalal"),
		@WebInitParam(name="age", value="56"),
		@WebInitParam(name="name", value="eshwar"),
		@WebInitParam(name="phoneNumber", value="8867094852"),
		@WebInitParam(name="email", value="ebhayyali@gmail.com"),
		@WebInitParam(name="password", value="******")
		  
})*/
public class LifeCycleSewrvlet extends GenericServlet{

	public LifeCycleSewrvlet() {
		System.out.println("servlet object is created");
	}
	@Override
	public void init() throws ServletException {
		System.out.println("Initializing the resources of LifeCycleResources");
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		
		ServletConfig config = getServletConfig();
 
    	String name =config.getInitParameter("Jiangalal");
		String age =config.getInitParameter("age");
		String myName =config.getInitParameter("name");
		String myPhoneNumber =config.getInitParameter("phoneNumber");
		String myEmailId =config.getInitParameter("email");
		String myPassword =config.getInitParameter("password");
		String height=config.getInitParameter("height");

		
		System.out.println("service method is executed");
		
		String appName = req.getParameter("appName");
		String appSize = req.getParameter("appSize");
		String appVersion = req.getParameter("appVersion");

		
		PrintWriter printWriter = resp.getWriter();
		printWriter.print("<html><body bgcolor='brightGreen'>"+"<h1> Thank you, you have successfully registered for  "
		+appName+
				"</h1>"+"</body</html>" );
	}
	@Override
	public void destroy() {
		System.out.println("closing the resources");
	}

	
}
