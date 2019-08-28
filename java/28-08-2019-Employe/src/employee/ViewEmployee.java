package employee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ViewEmployee
 */
public class ViewEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Statement statement = null;
	private ResultSet resultSet = null;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ViewEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			doView(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			doView(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doView(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		List<Employee> emp = new ArrayList<Employee>();

		Connection connection = MyConnectionFactory.getMySqlConnectionForHr();
		statement = connection.createStatement();
		resultSet = statement.executeQuery("select * from employee1");
		while (resultSet.next()) {
			emp.add(new Employee(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3),
					resultSet.getString(4)));
		}
		out.println("<table><tr><td>Name</td>" + "<td>Password</td>" + "<td>Email</td>" + "<td>Country</td>"
				+ "<td>Edit</td>" + "<td>Delete</td></tr>");
		for (Employee e : emp) {
			out.print("<tr><td>" + e.getName() + "</td><td>" + e.getPassword() + "</td><td>" + e.getEmail()
					+ "</td><td>" + e.getCountry() + "</td><td><a href='Edit?name="+e.getName()+"'>Edit</a></td>"
					+ "<td><a href='Delete?name="+e.getName()+"'>Delete</a></td></tr>");
		}
		out.println("</table>");
	}

}
