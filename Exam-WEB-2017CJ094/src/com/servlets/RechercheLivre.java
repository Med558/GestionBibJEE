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
 * Servlet implementation class RechercheLivre
 */
@WebServlet("/RechercheLivre")
public class RechercheLivre extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@EJB
	 private LivreSessionBean.LivreSessionBean ejb;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RechercheLivre() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/recherche.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Livre l = new Livre(); 
		l = ejb.rechercherLivre(Integer.parseInt(request.getParameter("idLivre"))); 
		request.setAttribute("livre", l); 
		this.getServletContext().getRequestDispatcher("/WEB-INF/recherche.jsp").forward(request,response);
	}

}
