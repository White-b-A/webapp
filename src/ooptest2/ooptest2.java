package ooptest2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class ooptest2
 */
@WebServlet("/ooptest2")
public class ooptest2 extends HttpServlet {
	private String encoding = "UTF-8";;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding(encoding);
		response.setContentType("text/html; charset="+encoding);
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//				Connection con = DriverManager.getConnection("jdbc://172.20.10.3/test?serverTimezone="
//						+ "JST","root","root");
//			}
//		}

		String id = request.getParameter("userid");
		String pass = request.getParameter("password");
		String sql = "select * from user";
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		//out.println("<meta charset=\"UTF-8\">");
		out.println("<link rel=\"stylesheet\" href=\"ooptest.css\">");
		out.println("<title>メインメニュー</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>メインメニュー</h1>");
		out.println("<div>");
		out.println("<button id=\"b\" type=\"button\" onclick=\"location.href='./ooptest.html'\">"+"ログアウト");
		out.println("</div>");
		out.println("</body>");
		out.println("</html>");
	}

}
