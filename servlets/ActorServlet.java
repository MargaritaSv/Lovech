package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import actors.Actor;
import actors.ActorDAO;

@WebServlet("/actors")
public class ActorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ActorDAO actorDAO;

	public ActorServlet() {
		super();
	}

	@Override
	public void init() throws ServletException {
		super.init();
		actorDAO = new ActorDAO();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ArrayList<Actor> actors = actorDAO.selectAllActors();
		request.setAttribute("actors", actors);
		request.getRequestDispatcher("showAllActors.jsp").forward(request, response);
	}
}