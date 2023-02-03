package tn.esprit.spring.entity;
import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class DetailFacture implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	Long idDetailFacture;
	int qteCommandee;
	float prixTotalDetail;
	int pourcentageRemise;
	float montantRmise;
	
	//
	@ManyToOne(cascade = CascadeType.ALL)
	private Product produit ;
	//
	
	
	//
	@ManyToOne(cascade = CascadeType.ALL)
	Facture factures ;
	//
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "DetailFacture [idDetailFacture=" + idDetailFacture + ", qteCommandee=" + qteCommandee
				+ ", prixTotalDetail=" + prixTotalDetail + ", pourcentageRemise=" + pourcentageRemise
				+ ", montantRmise=" + montantRmise + "]";
	}
	public DetailFacture() {
		super();
	}
	public Long getIdDetailFacture() {
		return idDetailFacture;
	}
	public void setIdDetailFacture(Long idDetailFacture) {
		this.idDetailFacture = idDetailFacture;
	}
	public int getQteCommandee() {
		return qteCommandee;
	}
	public void setQteCommandee(int qteCommandee) {
		this.qteCommandee = qteCommandee;
	}
	public float getPrixTotalDetail() {
		return prixTotalDetail;
	}
	public void setPrixTotalDetail(float prixTotalDetail) {
		this.prixTotalDetail = prixTotalDetail;
	}
	public int getPourcentageRemise() {
		return pourcentageRemise;
	}
	public void setPourcentageRemise(int pourcentageRemise) {
		this.pourcentageRemise = pourcentageRemise;
	}
	public float getMontantRmise() {
		return montantRmise;
	}
	public void setMontantRmise(float montantRmise) {
		this.montantRmise = montantRmise;
	}
	
	

}
