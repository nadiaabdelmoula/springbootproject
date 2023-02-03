package tn.esprit.spring.entity;
import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class CategorieProduit implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	Long idCtegorieProduit;
	String codeProduit;
	String libelleCategorieProduit;
	
	
	
	//
	@OneToMany(mappedBy="categorieProduit", cascade = CascadeType.ALL)
	private Set<Product> produits ;
	//
	
	
	
	
	
	@Override
	public String toString() {
		return "CategorieProduit [idCtegorieProduit=" + idCtegorieProduit + ", codeProduit=" + codeProduit
				+ ", libelleCategorieProduit=" + libelleCategorieProduit + "]";
	}
	public CategorieProduit() {
		super();
	}
	public Long getIdCtegorieProduit() {
		return idCtegorieProduit;
	}
	public void setIdCtegorieProduit(Long idCtegorieProduit) {
		this.idCtegorieProduit = idCtegorieProduit;
	}
	public String getCodeProduit() {
		return codeProduit;
	}
	public void setCodeProduit(String codeProduit) {
		this.codeProduit = codeProduit;
	}
	public String getLibelleCategorieProduit() {
		return libelleCategorieProduit;
	}
	public void setLibelleCategorieProduit(String libelleCategorieProduit) {
		this.libelleCategorieProduit = libelleCategorieProduit;
	}
	
	
	

}
