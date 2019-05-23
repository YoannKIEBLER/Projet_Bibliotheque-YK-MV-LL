package fr.adaming.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.adaming.model.Livre;
import fr.adaming.service.IServiceLivre;
import fr.adaming.service.ServiceLivre;

@WebServlet("/add")
public class ServletAdd extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
System.out.println("Entrer dans servletAdd");
		
		String titre = request.getParameter("titre");
		request.setAttribute("titre", titre);
		System.out.println(titre);
		String auteur = request.getParameter("auteur");
		request.setAttribute("auteur", auteur);
		System.out.println(auteur);
		float prix = Float.parseFloat(request.getParameter("prix"));
		request.setAttribute("prix", prix);
		System.out.println(prix);
		
		IServiceLivre service = new ServiceLivre();
		Livre l = new Livre(request.getParameter("titre"), request.getParameter("auteur"), Float.parseFloat(request.getParameter("prix")));
		service.ajouterLivre(l);
		System.out.println("ajout ok");
		RequestDispatcher dispatcher = request.getRequestDispatcher("/serv");
		dispatcher.forward(request, response);
		System.out.println("direction accueil");
	}
	

}
