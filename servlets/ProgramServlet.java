package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import program.Program;
import program.ProgramDAO;

@WebServlet("/schedule for month")
public class ProgramServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ProgramDAO programDAO;

	public ProgramServlet() {
		super();
	}

	@Override
	public void init() throws ServletException {
		super.init();
		programDAO = new ProgramDAO();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ArrayList<Program> program = programDAO.selectProgram("month");
		request.setAttribute("program", program);
		request.getRequestDispatcher("programa.jsp").forward(request, response);
	}
}