package ch02.ex03;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/FormCheckboxServlet")
public class FormCheckboxServlet extends HttpServlet {
	public void init() {
		System.out.println("init() 호출");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet() 호출");
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");

		PrintWriter out = response.getWriter();
		// NullPointerException 해결 #1	
			String[] lang = request.getParameterValues("lang");
				
			String data = "<html>";
			if (lang == null) {
				data += "선택 언어 없음";
			}
			else {
				for (int i = 0; i < lang.length; i++) {
					switch (lang[i]) {
					case "1": lang[i] = "Python"; break;
					case "2": lang[i] = "C/C++"; break;
					case "3": lang[i] = "Java"; break;
					case "4": lang[i] = "Javascript"; break;
					default: break;
					}			
					data += "<div>선택 언어: " + lang[i] + "</div>";  // HTML 문서로 출력
					System.out.println("선택 언어: " + lang[i]);  // 콘솔에 출력
				}				
			}
			data += "</html>";
			out.print(data);		
	}
	public void destroy() {
		System.out.println("destroy() 호출");
	}
}
