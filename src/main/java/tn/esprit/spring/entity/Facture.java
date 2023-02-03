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
public class Facture implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long idFacture;
	float MontantRemise;
	float MontantFacture;
	@Temporal(TemporalType.DATE)
	Date dateCreationFacture;
	@Temporal(TemporalType.DATE)
	Date dateDerniereModification;
	boolean archivee;
	
	
	
	
	//
	@OneToMany(mappedBy="factures" ,cascade =CascadeType.ALL)
	private Set<DetailFacture> detailFacture ;
	//
	
	
	
	//
	@OneToMany(mappedBy="facture",cascade =CascadeType.ALL)
	private Set<Reglement> reglement ;
	//
	
	
	//
	@ManyToOne(cascade =CascadeType.ALL)
	private Fournisseur fournisseur ;
    //
	
	
	
	@Override
	public String toString() {
		return "Facture [idFacture=" + idFacture + ", MontantRemise=" + MontantRemise + ", MontantFacture="
				+ MontantFacture + ", dateCreationFacture=" + dateCreationFacture + ", dateDerniereModification="
				+ dateDerniereModification + ", archivee=" + archivee + "]";
	}
	public Facture() {
		super();
	}
	public Long getIdFacture() {
		return idFacture;
	}
	public void setIdFacture(Long idFacture) {
		this.idFacture = idFacture;
	}
	public float getMontantRemise() {
		return MontantRemise;
	}
	public void setMontantRemise(float montantRemise) {
		MontantRemise = montantRemise;
	}
	public float getMontantFacture() {
		return MontantFacture;
	}
	public void setMontantFacture(float montantFacture) {
		MontantFacture = montantFacture;
	}
	public Date getDateCreationFacture() {
		return dateCreationFacture;
	}
	public void setDateCreationFacture(Date dateCreationFacture) {
		this.dateCreationFacture = dateCreationFacture;
	}
	public Date getDateDerniereModification() {
		return dateDerniereModification;
	}
	public void setDateDerniereModification(Date dateDerniereModification) {
		this.dateDerniereModification = dateDerniereModification;
	}
	public boolean isArchivee() {
		return archivee;
	}
	public void setArchivee(boolean archivee) {
		this.archivee = archivee;
	}
	
	
	
	


}
