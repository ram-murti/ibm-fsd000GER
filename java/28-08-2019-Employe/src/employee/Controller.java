package employee;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller
 */
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private String name,pass,email,country;
       private List<String> errMsgs;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			doControl(request, response);
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
			doControl(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	protected void doControl(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		// TODO Auto-generated method stub
		errMsgs=new LinkedList<String>();
		name=request.getParameter("Name");
		country=request.getParameter("Country");
		email=request.getParameter("Email");
		pass=request.getParameter("Password");
		if(name.length()<2) {
			errMsgs.add("length should be greater than 2");
		}
		if(country.equals("Unknown")) {
			errMsgs.add("Country is unknown");

		}
		if(errMsgs.isEmpty())
		{
			
			Connection connection=MyConnectionFactory.getMySqlConnectionForHr();
			PreparedStatement ps=connection.prepareStatement("insert into employee1(name,password,email,country) values(?,?,?,?)");
			ps.setString(1, name);
			ps.setString(2, pass);
			ps.setString(3, email);
			ps.setString(4, country);
			ps.executeUpdate();
			request.setAttribute("SUCCESS", "Added SuccessFully");
			RequestDispatcher view=request.getRequestDispatcher("AddServlet_");
			view.forward(request, response);

	}
		
			else {
				request.setAttribute("ERROR", errMsgs);
				RequestDispatcher view=request.getRequestDispatcher("AddServlet_");
				view.forward(request, response);
			}
		
		

	}}
