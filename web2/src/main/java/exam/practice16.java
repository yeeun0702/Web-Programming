package exam;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/practice16")
public class practice16 extends HttpServlet{
	public void init() throws ServletException {
		System.out.println("init() 호출");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		System.out.println("doGet()호출");
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		
	}

}
