package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Product implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long idProduit;
	String codeProduit;
	String libelleProduit;
	float prix;
	@Temporal(TemporalType.DATE)
	Date dateCreation;
	@Temporal(TemporalType.DATE)
	Date dateDerniereModification;
	
	
	
	//
	@OneToMany(mappedBy="produit" ,cascade =CascadeType.ALL)
	private Set<DetailFacture> detailFactures ;
	//
	
	
	
	
	//
	@ManyToOne(cascade = CascadeType.ALL)
	private Stock stock ;
	//
	
	
	
	//
	@ManyToOne(cascade = CascadeType.ALL)
	private CategorieProduit categorieProduit ;
    //
	
	
	@Override
	public String toString() {
		return "Product [idProduit=" + idProduit + ", codeProduit=" + codeProduit + ", libelleProduit=" + libelleProduit
				+ ", prix=" + prix + ", dateCreation=" + dateCreation + ", dateDerniereModification="
				+ dateDerniereModification + "]";
	}
	public Product() {
		super();
	}
	public Long getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}
	public String getCodeProduit() {
		return codeProduit;
	}
	public void setCodeProduit(String codeProduit) {
		this.codeProduit = codeProduit;
	}
	public String getLibelleProduit() {
		return libelleProduit;
	}
	public void setLibelleProduit(String libelleProduit) {
		this.libelleProduit = libelleProduit;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public Date getDateDerniereModification() {
		return dateDerniereModification;
	}
	public void setDateDerniereModification(Date dateDerniereModification) {
		this.dateDerniereModification = dateDerniereModification;
	}
	
	
			

}
