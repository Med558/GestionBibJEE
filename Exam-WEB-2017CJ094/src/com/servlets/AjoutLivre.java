package com.servlets;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import entite.Livre;

/**
 * Servlet implementation class AjoutLivre
 */
@WebServlet("/AjoutLivre")
public class AjoutLivre extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	@EJB
	 private LivreSessionBean.LivreSessionBean ejb;
    public AjoutLivre() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/WEB-INF/ajoutLivre.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Livre l = new Livre();
		
		l.setIdLivre(Integer.parseInt(request.getParameter("idLivre")));
		l.setTitre((request.getParameter("titre")));
		l.setNbrTotalCopies(Integer.parseInt(request.getParameter("nbreTotalCopies")));
		l.setNbrCopiesDisponibles(Integer.parseInt(request.getParameter("nbreTotalCopies")));
		l.setImpactLivre(0);
		
		
				
		ejb.ajouterLivre(l); 
		request.setAttribute("message", "livre est ajouter !"); 
		this.getServletContext().getRequestDispatcher("/WEB-INF/ajoutLivre.jsp").forward(request,response);
	}

}
