package tn.esprit.spring.entity;
import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class SecteurActivite implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long idSecteurActivite;
	String codeSecteurActivite;
	String libelleSecteurAvtivite;
	
	
	
	
	
	
	//
	@ManyToMany(mappedBy="secteurActivite", cascade = CascadeType.ALL)
	private Set<Fournisseur> fournisseurs ;
    //

	@Override
	public String toString() {
		return "SecteurActivite [idSecteurActivite=" + idSecteurActivite + ", codeSecteurActivite="
				+ codeSecteurActivite + ", libelleSecteurAvtivite=" + libelleSecteurAvtivite + "]";
	}
	public SecteurActivite() {
		super();
	}
	public Long getIdSecteurActivite() {
		return idSecteurActivite;
	}
	public void setIdSecteurActivite(Long idSecteurActivite) {
		this.idSecteurActivite = idSecteurActivite;
	}
	public String getCodeSecteurActivite() {
		return codeSecteurActivite;
	}
	public void setCodeSecteurActivite(String codeSecteurActivite) {
		this.codeSecteurActivite = codeSecteurActivite;
	}
	public String getLibelleSecteurAvtivite() {
		return libelleSecteurAvtivite;
	}
	public void setLibelleSecteurAvtivite(String libelleSecteurAvtivite) {
		this.libelleSecteurAvtivite = libelleSecteurAvtivite;
	}
	
	

}
