


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
 * Servlet implementation class Validservlet
 */
public class Validservlet extends HttpServlet {
	private static int UID = 100;
       private String season,title,year;
      private int iyear;
       private List<String> errMsgs; 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Validservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			doProcess(request, response);
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
			doProcess(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		// TODO Auto-generated method stub
		errMsgs=new LinkedList<String>();
		season=request.getParameter("season");
		if(season.equals("Unknown"))
		{
			errMsgs.add("please select a valid season.");
		}
		
		year=request.getParameter("Year");
		try {
			iyear=Integer.parseInt(year);
			
		} catch (Exception e) {
			// TODO: handle exception
			errMsgs.add("year must be numeric");
		}
		
		
		title=request.getParameter("title");
		if(title.toString().length()<5)
		{
			errMsgs.add("title is too short.");
		}
		
		if(errMsgs.isEmpty())
		{
			
			Connection connection=MyConnectionFactory.getMySqlConnectionForHr();
			System.out.println(connection);
			PreparedStatement ps=connection.prepareStatement("insert into league1(season,title,year,uid) values(?,?,?,?)");
			ps.setString(1, title);
			ps.setString(2, season);
			ps.setInt(3, iyear);
			ps.setInt(4,UID );
			ps.executeUpdate();
			UID=UID+1;
			request.setAttribute("SUCCESS", new League(title, season, iyear));
			RequestDispatcher  view=request.getRequestDispatcher("success.view");
			view.forward(request, response);
			
		}
		else {
			request.setAttribute("ERROR", errMsgs);
			RequestDispatcher view=request.getRequestDispatcher("Add_");
			view.forward(request, response);
		}
	}
}
