package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Reglement implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long idReglement;
	float montantPaye;
	float montantRestant;
	boolean payee;
	public Reglement() {
		super();
	}
	
	
	
	//
	@ManyToOne
	private Facture facture ;
	//
	
	
	
	@Override
	public String toString() {
		return "Reglement [idReglement=" + idReglement + ", montantPaye=" + montantPaye + ", montantRestant="
				+ montantRestant + ", payee=" + payee + ", dateReglement=" + dateReglement + "]";
	}
	@Temporal(TemporalType.DATE)
	Date dateReglement;
	public Long getIdReglement() {
		return idReglement;
	}
	public void setIdReglement(Long idReglement) {
		this.idReglement = idReglement;
	}
	public float getMontantPaye() {
		return montantPaye;
	}
	public void setMontantPaye(float montantPaye) {
		this.montantPaye = montantPaye;
	}
	public float getMontantRestant() {
		return montantRestant;
	}
	public void setMontantRestant(float montantRestant) {
		this.montantRestant = montantRestant;
	}
	public boolean isPayee() {
		return payee;
	}
	public void setPayee(boolean payee) {
		this.payee = payee;
	}
	public Date getDateReglement() {
		return dateReglement;
	}
	public void setDateReglement(Date dateReglement) {
		this.dateReglement = dateReglement;
	}
	
	
	
}
