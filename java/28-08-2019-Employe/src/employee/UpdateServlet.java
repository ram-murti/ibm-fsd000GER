package employee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateServlet
 */
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private Statement statement=null;
       private ResultSet resultSet=null;
       private List<String> errMsgs;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			doUpdate(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			doUpdate(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	protected void doUpdate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String pass=request.getParameter("Password");
		String email=request.getParameter("Email");
		String country=request.getParameter("Country");
		errMsgs=new LinkedList<String>();
		if(name.length()<2) {
			errMsgs.add("length should be greater than 2");
		}
		if(country.equals("Unknown")) {
			errMsgs.add("Country is unknown");

		}
		if(errMsgs.isEmpty()) {
		Connection connection = MyConnectionFactory.getMySqlConnectionForHr();
		statement = connection.createStatement();
		PreparedStatement ps=connection.prepareStatement("update  employee1 set password=?,email=?,country=? where name=?");
		ps.setString(1, pass);
		ps.setString(2, email);
		ps.setString(3, country);
	    ps.setString(4, name);
		ps.executeUpdate();
		request.setAttribute("SUCCESS", "Added SuccessFully");

		RequestDispatcher view=request.getRequestDispatcher("Edit");
		view.forward(request, response);}
		else {
			request.setAttribute("ERROR", errMsgs);
			RequestDispatcher view=request.getRequestDispatcher("Edit");
			view.forward(request, response);
		}
	}

}
