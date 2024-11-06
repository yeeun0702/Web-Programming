package ch02.ex03;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/FormRadioServlet")
public class FormRadioServlet extends HttpServlet {
	public void init() {
		System.out.println("init() 호출");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet() 호출");
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");

		// form3_radio.html로부터 전달된 dept의 value 값이 학부 명칭인 경우
		// 예) dept="IT융합자율학부"
		/*
		PrintWriter out = response.getWriter();
		String str = request.getParameter("dept");
		
		System.out.println("소속 학부: " + str);

		String data = "<html>";
		data += "<head><title>radio</title></head>";
		data += "<body>";
		data += "<div>소속 학부: ";
		data += str;
		data += "</div>";
		data += "</body>";
		data += "</html>";
				
		out.print(data);
		*/
		
		// form3_radio_cond.html로부터 전달된 dept의 value 값이 숫자인 경우
		// 예) dept="4" 
		PrintWriter out = response.getWriter();
		String str = request.getParameter("dept");
		
		switch (str) {
			case "1": str = "인문융합자율학부"; break; 
			case "2": str = "사회융합자율학부"; break;
			case "3": str = "미디어컨텐츠융합자율학부"; break;
			case "4": str = "IT융합자율학부"; break;
			default: break;
		}
		
		String data = "<html>";
		data += "<head><title>radio</title></head>";
		data += "<body>";
		data += "<div>소속 학부: ";
		data += str;
		data += "</div>";
		data += "</body>";
		data += "</html>";
		
		out.print(data);
		
		System.out.println("소속 학부: " + str);
	}

	public void destroy() {
		System.out.println("destroy() 호출");
	}
}