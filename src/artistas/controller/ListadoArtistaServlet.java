package artistas.controller;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import artistas.model.Artista;
import artistas.services.ArtistaService;

@WebServlet("/list.do")
public class ListadoArtistaServlet extends HttpServlet {

	private static final long serialVersionUID = -3490536730801724234L;

	public ListadoArtistaServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		this.doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		this.doProcess(request, response);
	}

	private void doProcess(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		ArtistaService artistaService = ArtistaService.getInstance();
		List<Artista> artistas = artistaService.mazinger();
		
		request.setAttribute("artistas", artistas);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/list.jsp");
	    dispatcher.forward(request, response);
		
		
		

	}

}
