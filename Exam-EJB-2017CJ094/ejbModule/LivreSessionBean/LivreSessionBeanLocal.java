package LivreSessionBean;

import java.util.List;

import javax.ejb.Local;

import entite.Livre;

@Local
public interface LivreSessionBeanLocal {
public void ajouterLivre (Livre l);
public Livre rechercherLivre(int idLivre);
public boolean emprunterLivre(int idLivre);
public void rendreLivre(int idLivre);
public List<Livre> listerLivres() ;
}
