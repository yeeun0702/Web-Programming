package exam;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/practice09")
public class practice09 extends HttpServlet {
	public void init() throws ServletException{
		System.out.println("init() 호출");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		request.setCharacterEncoding("utf-8");
		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
		System.out.println("계정 : " + user_id);
		System.out.println("암호 : " + user_pw);
	}
	
	public void destory() {
		System.out.println("destory() 호출");
	}

}
