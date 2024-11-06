package ch02.ex03;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/FormSelectServlet")
public class FormSelectServlet extends HttpServlet {
	public void init() {
		System.out.println("init() 호출");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet() 호출");
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");

		PrintWriter out = response.getWriter();

		// NullPointerException 해결 #2		
		try {
		String[] it = request.getParameterValues("it");
		String data = "<html>";
		
			
			for (int i = 0; i < it.length; i++) {
				switch (it[i]) {
				case "1": it[i] = "웹 개발"; break;
				case "2": it[i] = "컴퓨터구조"; break;
				case "3": it[i] = "소프트웨어 공학"; break;
				case "4": it[i] = "모바일 게임"; break;
				case "5": it[i] = "네트워크 통신"; break;
				default: break;
				}
				data += "<div>관심 분야 #" + (i+1) + ": " + it[i] + "</div>";
				System.out.println("관심 분야 #" + (i+1) + ": " + it[i]);			
		}			
		data += "</html>";
		out.print(data);
		}catch(NullPointerException e) {
			out.print("<html> 관심 분야 없음 </html>");
		}
	}

	public void destroy() {
		System.out.println("destroy() 호출");
	}
}