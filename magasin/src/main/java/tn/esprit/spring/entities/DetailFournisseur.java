package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DetailFournisseur implements Serializable {
	public DetailFournisseur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DetailFournisseur(Long idDetailFournisseur, Date dateDebutCollaboration, String adresse, String matricule,
			Fournisseur fournisseur) {
		super();
		this.idDetailFournisseur = idDetailFournisseur;
		this.dateDebutCollaboration = dateDebutCollaboration;
		this.adresse = adresse;
		this.matricule = matricule;
		this.fournisseur = fournisseur;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDetailFournisseur;
	@Temporal(TemporalType.DATE)
	private Date dateDebutCollaboration;
	private String adresse;
	private String matricule;
	@OneToOne(mappedBy = "detailFournisseur",cascade = CascadeType.ALL)//creation des que cree fournisseur
	private Fournisseur fournisseur;
	public Long getIdDetailFournisseur() {
		return idDetailFournisseur;
	}
	public void setIdDetailFournisseur(Long idDetailFournisseur) {
		this.idDetailFournisseur = idDetailFournisseur;
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
	public Fournisseur getFournisseur() {
		return fournisseur;
	}
	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}
	

}
