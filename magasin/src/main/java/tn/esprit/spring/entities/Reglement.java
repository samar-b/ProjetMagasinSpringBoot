package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
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
@Table(name ="reglement" )
public class Reglement implements Serializable {
	public Reglement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Reglement(Long idReglement, float montantPaye, float montantRestant, boolean payee, Date dateReglement,
			Facture facture) {
		super();
		this.idReglement = idReglement;
		this.montantPaye = montantPaye;
		this.montantRestant = montantRestant;
		this.payee = payee;
		this.dateReglement = dateReglement;
		this.facture = facture;
	}
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long idReglement;
	private float montantPaye;
	private float montantRestant ;
	private boolean  payee;
	@Temporal(TemporalType.DATE)
	private Date dateReglement;
	@ManyToOne(cascade =CascadeType.ALL )
	private Facture facture;
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
	public Facture getFacture() {
		return facture;
	}
	public void setFacture(Facture facture) {
		this.facture = facture;
	}
	
	
	

}
