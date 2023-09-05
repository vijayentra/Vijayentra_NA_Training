package com.basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException , ServletException {
//		PrintWriter writer = resp.getWriter();
//		writer.println("<html>");
//		writer.println("<head>");
//		writer.println("<title>Yahoo!!</title>");
//		writer.println("</head>");
//		writer.println("<body>");
//		writer.println("My First Servlet");
//		writer.println("</body>");
//		writer.println("</html>");
		
		//using jsp
		String name = req.getParameter("name");
		req.setAttribute("name", name);
		req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, resp);
		
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException , ServletException {
		String name = req.getParameter("name");
		req.setAttribute("name", name);
		req.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(req, resp);
		
	}
}
