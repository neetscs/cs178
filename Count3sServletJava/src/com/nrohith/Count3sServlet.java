package com.nrohith;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Count3sServlet extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws IOException{
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Hello Servlet Get</h1>");
		out.println("</body>");
		out.println("</html>");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws IOException{
		String userInput = request.getParameter("userInput");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Hello Servlet Post" + userInput + "</h1>");
		int numberOfThrees = countThrees(userInput);
		out.println("<br>Number of threes: " + numberOfThrees);
		out.println("</body>");
		out.println("</html>");
	}
	
	public int countThrees(String input){
	
		int counter = 0;
		for(int i=0; i < input.length(); i++) {
			if ( input.charAt(i) == '3') 
				counter++;
		}
		return counter;
	}

}

