package LivreSessionBean;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import entite.Livre;

/**
 * Session Bean implementation class LivreSessionBean
 */
@Stateless
@LocalBean
public class LivreSessionBean implements LivreSessionBeanLocal {

    /**
     * Default constructor. 
     */
	@PersistenceContext(unitName = "Exam-EJB-2017CJ094")
	private EntityManager entityManager ;
	
    public LivreSessionBean() {
        // TODO Auto-generated constructor stub
    }
	@Override
	public void ajouterLivre(Livre l) {

		entityManager.persist(l);
		
	}
	@Override
	public Livre rechercherLivre(int idLivre) {
		Livre l=entityManager.find(Livre.class, idLivre);
		return l;
	}
	@Override
	public boolean emprunterLivre(int idLivre) {
		Livre l=entityManager.find(Livre.class, idLivre);
		if(l.getNbrCopiesDisponibles()==0) {
			return false;
		}else {
			l.setNbrCopiesDisponibles(l.getNbrCopiesDisponibles()-1);
			entityManager.merge(l);
			return true;
		}
	}
	@Override
	public void rendreLivre(int idLivre) {
		Livre l=entityManager.find(Livre.class, idLivre);
		l.setNbrCopiesDisponibles(l.getNbrCopiesDisponibles()+1);
		l.setImpactLivre(l.getImpactLivre()+1);
		entityManager.merge(l);
		
	}
	@Override
	public List<Livre> listerLivres() {
		TypedQuery <Livre> query = entityManager.createQuery("SELECT l FROM livres l", Livre.class);
		List<Livre> listLivre = query.getResultList(); 
		return listLivre;
	}
    
}
