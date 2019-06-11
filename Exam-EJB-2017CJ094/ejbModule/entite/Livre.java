package entite;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Livre
 *
 */
@Entity
@Table(name="livres", schema = "bdexamen")
public class Livre implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	private int idLivre;
	private String titre;
	private int nbrTotalCopies;
	private int nbrCopiesDisponibles;
	private int impactLivre;

	public Livre() {
		super();
	}

	public Livre(int idLivre, String titre, int nbrTotalCopies, int nbrCopiesDisponibles, int impactLivre) {
		super();
		this.idLivre = idLivre;
		this.titre = titre;
		this.nbrTotalCopies = nbrTotalCopies;
		this.nbrCopiesDisponibles = nbrCopiesDisponibles;
		this.impactLivre = impactLivre;
	}

	public int getIdLivre() {
		return idLivre;
	}

	public void setIdLivre(int idLivre) {
		this.idLivre = idLivre;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public int getNbrTotalCopies() {
		return nbrTotalCopies;
	}

	public void setNbrTotalCopies(int nbrTotalCopies) {
		this.nbrTotalCopies = nbrTotalCopies;
	}

	public int getNbrCopiesDisponibles() {
		return nbrCopiesDisponibles;
	}

	public void setNbrCopiesDisponibles(int nbrCopiesDisponibles) {
		this.nbrCopiesDisponibles = nbrCopiesDisponibles;
	}

	public int getImpactLivre() {
		return impactLivre;
	}

	public void setImpactLivre(int impactLivre) {
		this.impactLivre = impactLivre;
	}

	@Override
	public String toString() {
		return "Livre num" + idLivre + "avec le titre" + titre + ", nbrTotalCopies=" + nbrTotalCopies + ", nbrCopiesDisponibles=" + nbrCopiesDisponibles + ", impact=" + impactLivre ;
	}
	
   
}
