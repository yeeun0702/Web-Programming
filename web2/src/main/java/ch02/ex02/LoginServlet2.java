package ch02.ex02;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login2")
public class LoginServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init() throws ServletException {
		System.out.println("init() 호출");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();

		String id = request.getParameter("user_id");
		String pw = request.getParameter("user_pw");

		String data = "<html>";
		data += "<body>";
		data += "계정: " + id;
		data += "<br>";
		data += "암호: " + pw;
		data += "</body>";
		data += "</html>";
		out.print(data);
	}
	public void destroy() {
		System.out.println("destroy() 호출");
	}
}