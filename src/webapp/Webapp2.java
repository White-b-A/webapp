package webapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class ooptest2
 */
@WebServlet("/Webapp2")
public class Webapp2 extends HttpServlet {
	private String encoding = "UTF-8";;
	String sql = "select * from user where id = ? and password = ?" ;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding(encoding);
		response.setContentType("text/html; charset="+encoding);
		String id = request.getParameter("userid");
		String pass = request.getParameter("password");
		String sql = "select * from user";
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
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
	protected boolean user(String id,String pass) {
		if (user == null || user.length() == 0 || pass == null || pass.length() == 0){
		      return false;
		    }
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc://172.20.10.3/test?serverTimezone="
						+ "JST","root","root");

				PreparedStatement stmt = con.prepareStatement(sql);
				stmt.setString(1,id);
				stmt.setString(2,pass);
				ResultSet rs = stmt.executeQuery();

			}catch(Exception ex) {
				String msg = "ドライバのロードに失敗しました";
			}
	}


}
