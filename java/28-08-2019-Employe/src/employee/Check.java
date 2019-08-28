package employee;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class Check
 */
public class Check implements Filter {

    /**
     * Default constructor. 
     */
    public Check() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		String name=request.getParameter("UserName");
		String pass=request.getParameter("password");
		System.out.println(name+pass);
		String p="admin";
		String q="admin";
		if(name.equalsIgnoreCase(p)&&pass.equalsIgnoreCase(p))
		{
			System.out.println("true");
		chain.doFilter(request, response);}
		else {
			
			RequestDispatcher view=request.getRequestDispatcher("CheckServlet_");
			view.forward(request, response);
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
