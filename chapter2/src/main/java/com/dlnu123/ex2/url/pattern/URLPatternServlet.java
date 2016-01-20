package com.dlnu123.ex2.url.pattern;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class URLPatternServlet
 */
public class URLPatternServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head>");
		out.print("<title>HelloServlet</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h3>" + request.getMethod() + "</h3>");
		out.print("<h3>" + request.getRequestURI() + "</h3>");
		out.print("<h3>" + request.getRequestURL() + "</h3>");
		out.print("<h3>" + request.getContextPath() + "</h3>");
		out.print("<h3>" + request.getServletPath() + "</h3>");
		out.print("<h3>" + request.getServerName() + "</h3>");
		out.print("<h3>" + request.getPathInfo() + "</h3>");
		out.print("</body>");
		out.print("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
