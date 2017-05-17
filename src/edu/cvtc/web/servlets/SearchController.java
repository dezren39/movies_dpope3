package edu.cvtc.web.servlets;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.cvtc.web.dao.MovieDao;
import edu.cvtc.web.dao.implementation.MovieDaoException;
import edu.cvtc.web.dao.implementation.MovieDaoImpl;
import edu.cvtc.web.model.Movie;

/**
 * Servlet implementation class SearchController
 */
@WebServlet("/Search")
public class SearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String target = null;
		
		try {
			final MovieDao movieDao = new MovieDaoImpl();
			final List<Movie> movies = movieDao.retrieveMovies();
			
			final String title = request.getParameter("title");
			final String director = request.getParameter("director");
			final List<Movie> filteredMovies = movies
													.stream()
													.filter((movie) -> movie.getTitle().toLowerCase().contains(title.toLowerCase()))
													.filter((movie) -> movie.getDirector().toLowerCase().contains(director.toLowerCase()))
													.collect(Collectors.toList());
			
			request.setAttribute("movies", filteredMovies);
			
			target = "view-all.jsp";
						
		
		} catch(MovieDaoException e) {
			e.printStackTrace();
			throw new IOException("The workbook file has an invalid format.");
		}	
		
		request.getRequestDispatcher(target).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
