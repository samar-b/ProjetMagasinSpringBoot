package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

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
public class Fournisseur implements Serializable {
	public Fournisseur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Fournisseur(Long idFournisseur, String codeFournisseur, String libelleFournisseur,
			CategorieFournisseur categorieFournisseur, List<Facture> factures, DetailFournisseur detailFournisseur,
			List<SecteurActivite> secteurActivites) {
		super();
		this.idFournisseur = idFournisseur;
		this.codeFournisseur = codeFournisseur;
		this.libelleFournisseur = libelleFournisseur;
		this.categorieFournisseur = categorieFournisseur;
		this.factures = factures;
		this.detailFournisseur = detailFournisseur;
		this.secteurActivites = secteurActivites;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFournisseur;
	private String codeFournisseur;
	private String libelleFournisseur;
	@Enumerated(EnumType.STRING)
	private CategorieFournisseur categorieFournisseur;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "fournisseur")
	@JsonIgnore
	private List<Facture>factures;
	@OneToOne
	private DetailFournisseur detailFournisseur;
	@ManyToMany(cascade = CascadeType.ALL)
	@JsonIgnore
	private List<SecteurActivite> secteurActivites;
	public Long getIdFournisseur() {
		return idFournisseur;
	}
	public void setIdFournisseur(Long idFournisseur) {
		this.idFournisseur = idFournisseur;
	}
	public String getCodeFournisseur() {
		return codeFournisseur;
	}
	public void setCodeFournisseur(String codeFournisseur) {
		this.codeFournisseur = codeFournisseur;
	}
	public String getLibelleFournisseur() {
		return libelleFournisseur;
	}
	public void setLibelleFournisseur(String libelleFournisseur) {
		this.libelleFournisseur = libelleFournisseur;
	}
	public CategorieFournisseur getCategorieFournisseur() {
		return categorieFournisseur;
	}
	public void setCategorieFournisseur(CategorieFournisseur categorieFournisseur) {
		this.categorieFournisseur = categorieFournisseur;
	}
	public List<Facture> getFactures() {
		return factures;
	}
	public void setFactures(List<Facture> factures) {
		this.factures = factures;
	}
	public DetailFournisseur getDetailFournisseur() {
		return detailFournisseur;
	}
	public void setDetailFournisseur(DetailFournisseur detailFournisseur) {
		this.detailFournisseur = detailFournisseur;
	}
	public List<SecteurActivite> getSecteurActivites() {
		return secteurActivites;
	}
	public void setSecteurActivites(List<SecteurActivite> secteurActivites) {
		this.secteurActivites = secteurActivites;
	}
	

}
