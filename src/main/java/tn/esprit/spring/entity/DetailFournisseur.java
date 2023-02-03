package tn.esprit.spring.entity;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class DetailFournisseur implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long idDetalFournisseur;
	@Temporal(TemporalType.DATE)
	Date dateDebutCollaboration;
	String adresse;
	String matricule;
	
	
	
	
	//
	@OneToOne(mappedBy="detailFournisseur")
	private Fournisseur fournisseur ;
	//
	
	
	@Override
	public String toString() {
		return "DetailFournisseur [idDetalFournisseur=" + idDetalFournisseur + ", dateDebutCollaboration="
				+ dateDebutCollaboration + ", adresse=" + adresse + ", matricule=" + matricule + "]";
	}
	public DetailFournisseur() {
		super();
	}
	public Long getIdDetalFournisseur() {
		return idDetalFournisseur;
	}
	public void setIdDetalFournisseur(Long idDetalFournisseur) {
		this.idDetalFournisseur = idDetalFournisseur;
	}
	public Date getDateDebutCollaboration() {
		return dateDebutCollaboration;
	}
	public void setDateDebutCollaboration(Date dateDebutCollaboration) {
		this.dateDebutCollaboration = dateDebutCollaboration;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	

}
