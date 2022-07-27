package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Facture")
public class Facture implements Serializable{
	public Facture() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Facture(Long idFacture, float montantRemise, float montantFacture, Date dateCreationFacture,
			Date dateDerniereModification, boolean archivee, List<Reglement> reglements,
			List<DetailFacture> detailFactures, Fournisseur fournisseur) {
		super();
		this.idFacture = idFacture;
		this.montantRemise = montantRemise;
		this.montantFacture = montantFacture;
		this.dateCreationFacture = dateCreationFacture;
		this.dateDerniereModification = dateDerniereModification;
		this.archivee = archivee;
		this.reglements = reglements;
		this.detailFactures = detailFactures;
		this.fournisseur = fournisseur;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFacture;
	private float montantRemise;
	private float montantFacture;
	@Temporal(TemporalType.DATE)
	private Date dateCreationFacture;
	@Temporal(TemporalType.DATE)
	private Date dateDerniereModification;
	private boolean archivee;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "facture")
	@JsonIgnore
	private List<Reglement>reglements;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "facture")
	@JsonIgnore
	private List<DetailFacture>detailFactures;
	@ManyToOne
	private Fournisseur fournisseur;
	public Long getIdFacture() {
		return idFacture;
	}
	public void setIdFacture(Long idFacture) {
		this.idFacture = idFacture;
	}
	public float getMontantRemise() {
		return montantRemise;
	}
	public void setMontantRemise(float montantRemise) {
		this.montantRemise = montantRemise;
	}
	public float getMontantFacture() {
		return montantFacture;
	}
	public void setMontantFacture(float montantFacture) {
		this.montantFacture = montantFacture;
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
	public List<Reglement> getReglements() {
		return reglements;
	}
	public void setReglements(List<Reglement> reglements) {
		this.reglements = reglements;
	}
	public List<DetailFacture> getDetailFactures() {
		return detailFactures;
	}
	public void setDetailFactures(List<DetailFacture> detailFactures) {
		this.detailFactures = detailFactures;
	}
	public Fournisseur getFournisseur() {
		return fournisseur;
	}
	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}
	

}
