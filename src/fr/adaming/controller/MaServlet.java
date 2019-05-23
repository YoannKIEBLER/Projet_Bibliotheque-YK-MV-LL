package fr.adaming.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.adaming.dao.DaoLivre;
import fr.adaming.dao.IDaoLivre;
import fr.adaming.model.Livre;
import fr.adaming.service.IServiceLivre;
import fr.adaming.service.ServiceLivre;
@WebServlet("/serv")
public class MaServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		doPost(request, response);
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		IServiceLivre service = new ServiceLivre();
			 
	
		List<Livre> myList = service.getAll();
	

		request.setAttribute("liste", myList);
	
	
	
	
	RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
	dispatcher.forward(request, response);
	}
	
	

}
