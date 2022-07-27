package tn.esprit.spring.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "DetailFacture")
public class DetailFacture implements Serializable {
	public DetailFacture() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DetailFacture(Long idDetailFacture, int qteCommandes, float prixTotalDetail, int pourcentageRemise,
			float montantRemise, Facture facture, Produit produit) {
		super();
		this.idDetailFacture = idDetailFacture;
		this.qteCommandes = qteCommandes;
		this.prixTotalDetail = prixTotalDetail;
		this.pourcentageRemise = pourcentageRemise;
		this.montantRemise = montantRemise;
		this.facture = facture;
		this.produit = produit;
	}
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDetailFacture;
	private int qteCommandes;
	private float prixTotalDetail;
	private int pourcentageRemise ;
	private float montantRemise;
	@ManyToOne
	private Facture facture;
	@ManyToOne 
	private Produit produit;
	public Long getIdDetailFacture() {
		return idDetailFacture;
	}
	public void setIdDetailFacture(Long idDetailFacture) {
		this.idDetailFacture = idDetailFacture;
	}
	public int getQteCommandes() {
		return qteCommandes;
	}
	public void setQteCommandes(int qteCommandes) {
		this.qteCommandes = qteCommandes;
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
	public float getMontantRemise() {
		return montantRemise;
	}
	public void setMontantRemise(float montantRemise) {
		this.montantRemise = montantRemise;
	}
	public Facture getFacture() {
		return facture;
	}
	public void setFacture(Facture facture) {
		this.facture = facture;
	}
	public Produit getProduit() {
		return produit;
	}
	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	
}
