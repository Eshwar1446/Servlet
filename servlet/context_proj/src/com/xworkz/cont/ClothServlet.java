package com.xworkz.cont;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/cp")
public class ClothServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 
		Product pro = new Product();
		pro.id=245;
		pro.name="Jeans";
		pro.price=1245;
		pro.brand="FLYING MACHINE";
		
		ServletContext context = getServletContext();
		String name1 = context.getInitParameter("name1");
		String name2 =	context.getInitParameter("name2");
		
		
		PrintWriter printWriter = resp.getWriter();
		printWriter.print("<html><body bgcolor='cyan'>"
				+"<h1> This is''" +name1 +" ' '</h1>"
				+"<h2> This is''" +name2 +" ' '</h2>"
				+"<h3> Thank you for selecting electronic''" +pro.name +" ' '</h3>"
				+"<h3> Your product Deatails are''" +pro +" ' '</h3>"				
				+"<a href='context.html'>back</a1>"
		 +"</body</html>" );
	}
}
