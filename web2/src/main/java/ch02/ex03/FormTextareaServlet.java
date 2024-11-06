package ch02.ex03;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/FormTextareaServlet")
public class FormTextareaServlet extends HttpServlet {
	public void init() {
		System.out.println("init() 호출");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet() 호출");
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = response.getWriter();
		String str = request.getParameter("textarea");
		
		System.out.println("기타 의견: " + str);

		String data = "<html>";
		data += "<body>";
		data += "<div style=\"font-size:1.2em; font-weight:bold; margin-bottom:5px;\">기타 의견</div>";
		data += str;
		data += "</body>";
		data += "</html>";
		
		out.print(data);
	}

	public void destroy() {
		System.out.println("destroy() 호출");
	}
}

