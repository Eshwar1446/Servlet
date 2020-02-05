package com.servlet.chaining;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/secondFlipcart")
public class SecondFlipcartServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String product = req.getParameter("pp");
		String quantity = req.getParameter("qt");
		int  quantity1 = Integer.parseInt(quantity);
		
		double price=12000.00;
		double total = quantity1 * price;
		
	PrintWriter printWriter =	resp.getWriter();
	printWriter.print	("<html><body bgcolor='brightGreen'>"+"<h1> Total amount is\t"+total+
			"</h1>"+"</body</html>" );
	}
}
