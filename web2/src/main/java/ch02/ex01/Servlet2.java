package ch02.ex01;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet {
	@Override
	public void init() throws ServletException {
		System.out.println("Servlet2의 init() 호출");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Servlet2의 doGet() 호출");
	}
	
	@Override
	public void destroy() {
		System.out.println("Servlet2의 destroy() 호출");
	}
}



