package ch02.ex03;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/FormInputServlet")
public class FormInputServlet extends HttpServlet {
	public void init() {
		System.out.println("init() 호출");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet() 호출");
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = response.getWriter();
		String id = request.getParameter("user_id");
		String pw = request.getParameter("user_pw");
		String email = request.getParameter("user_email");
		System.out.println("계정: " + id);
		System.out.println("암호: " + pw);
		System.out.println("메일: " + pw);

		String data = "<html>";
		data += "<body>";
		data += "계정: " + id;
		data += "<br>";
		data += "암호: " + pw;
		data += "<br>";
		data += "메일: " + email;
		data += "</body>";
		data += "</html>";
		
		out.print(data);
	}
	public void destroy() {
		System.out.println("destroy() 호출");
	}
}