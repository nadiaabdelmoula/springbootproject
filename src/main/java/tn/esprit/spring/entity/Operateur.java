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
public class Operateur implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	Long idOperateur;
    String nom; 
	String prenom;
	String password ;
	
	
	
	
	
	
	
	
	//
	@OneToMany(cascade =CascadeType.ALL)
	private Set<Facture> facturees ;
//
	
	
	@Override
	public String toString() {
		return "Operateur [idOperateur=" + idOperateur + ", nom=" + nom + ", prenom=" + prenom + ", password="
				+ password + "]";
	}
	public Operateur() {
		super();
	}
	public Long getIdOperateur() {
		return idOperateur;
	}
	public void setIdOperateur(Long idOperateur) {
		this.idOperateur = idOperateur;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
