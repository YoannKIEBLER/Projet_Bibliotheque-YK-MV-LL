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

@WebServlet("/Delete")
public class ServletDelete extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		request.setAttribute("id", id);
		System.out.println(id);
		
		
		IServiceLivre service = new ServiceLivre();
		service.deleteLivre(id);
		System.out.println("delete ok");
		RequestDispatcher dispatcher = request.getRequestDispatcher("/serv");
		dispatcher.forward(request, response);
		System.out.println("direction accueil");
}
	
	

}
