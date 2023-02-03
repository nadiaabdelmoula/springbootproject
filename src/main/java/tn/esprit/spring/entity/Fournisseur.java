package tn.esprit.spring.entity;
import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Fournisseur implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long idFournisseur;
	String codeFournisseur;
	String libelleFournisseur;
	CategorieFournisseur categorieFournisseur;
	
	//
	@OneToOne 
	private DetailFournisseur detailFournisseur ;
	//
	
	
	
	
	
	
	//
	@OneToMany(mappedBy="fournisseur",cascade =CascadeType.ALL)
	private Set<Facture> facture  ;
	//
	
	
	//
	@ManyToMany
	private Set <SecteurActivite> secteurActivite ;
	//
	
	
	
	@Override
	public String toString() {
		return "Fournisseur [idFournisseur=" + idFournisseur + ", codeFournisseur=" + codeFournisseur
				+ ", libelleFournisseur=" + libelleFournisseur + ", categorieFournisseur=" + categorieFournisseur + "]";
	}
	public Fournisseur() {
		super();
	}
	public Long getIdFournisseur() {
		return idFournisseur;
	}
	public void setIdFournisseur(Long idFournisseur) {
		this.idFournisseur = idFournisseur;
	}
	public String getCodeFournisseur() {
		return codeFournisseur;
	}
	public void setCodeFournisseur(String codeFournisseur) {
		this.codeFournisseur = codeFournisseur;
	}
	public String getLibelleFournisseur() {
		return libelleFournisseur;
	}
	public void setLibelleFournisseur(String libelleFournisseur) {
		this.libelleFournisseur = libelleFournisseur;
	}
	public CategorieFournisseur getCategorieFournisseur() {
		return categorieFournisseur;
	}
	public void setCategorieFournisseur(CategorieFournisseur categorieFournisseur) {
		this.categorieFournisseur = categorieFournisseur;
	}
	
	
	
	
	

}
