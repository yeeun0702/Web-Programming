package exam;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/practice10")
public class practice10 extends HttpServlet {
	public void init() throws ServletException {
		System.out.println("init() 호출");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet() 호출");
		doHandle(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost() 호출");
		doHandle(request, response);
	}

	private void doHandle(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		System.out.println("doHandle() 호출");
		String user_name = request.getParameter("user_name");
		String user_password = request.getParameter("user_password");
		System.out.println("계정" + user_name);
		System.out.println("계정" + user_password);
	}

	public void destroy() {
		System.out.println("destroy() 호출");
	}
}
