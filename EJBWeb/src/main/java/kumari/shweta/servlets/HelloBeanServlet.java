package kumari.shweta.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kumari.shweta.ejb.statelessbean.HelloBeanRemote;

@WebServlet("/HelloBeanServlet")
public class HelloBeanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public HelloBeanServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		InitialContext initialContext;
		try {
			initialContext = new InitialContext();

			/*
			 * Creating object of EJB bean (proxy object) throught Remote interface Invoking
			 * EJB bean in servlet
			 */
			
			HelloBeanRemote remote = (HelloBeanRemote) initialContext
					.lookup("java:global/EJBEar/EJBBean/HelloBean!kumari.shweta.ejb.statelessbean.HelloBeanRemote");

			String string = remote.sayHello();
			response.setContentType("text/html");
			PrintWriter printWriter = response.getWriter();
			printWriter.print(string);
		} catch (NamingException e) {

			e.printStackTrace();
		}

	}

}
