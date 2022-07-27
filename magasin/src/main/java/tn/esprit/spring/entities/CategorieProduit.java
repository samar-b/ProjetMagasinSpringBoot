package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

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
public class CategorieProduit implements Serializable {
	public CategorieProduit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CategorieProduit(Long idCategorieProduit, String codeProduit, String libelleCategorieProduit,
			List<Produit> produits) {
		super();
		this.idCategorieProduit = idCategorieProduit;
		this.codeProduit = codeProduit;
		this.libelleCategorieProduit = libelleCategorieProduit;
		this.produits = produits;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCategorieProduit;
	private String codeProduit;
	private String libelleCategorieProduit;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "categorieProduit")
	@JsonIgnore
	private List<Produit>produits;
	public Long getIdCategorieProduit() {
		return idCategorieProduit;
	}
	public void setIdCategorieProduit(Long idCategorieProduit) {
		this.idCategorieProduit = idCategorieProduit;
	}
	public String getCodeProduit() {
		return codeProduit;
	}
	public void setCodeProduit(String codeProduit) {
		this.codeProduit = codeProduit;
	}
	public String getLibelleCategorieProduit() {
		return libelleCategorieProduit;
	}
	public void setLibelleCategorieProduit(String libelleCategorieProduit) {
		this.libelleCategorieProduit = libelleCategorieProduit;
	}
	public List<Produit> getProduits() {
		return produits;
	}
	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}
	
	
	
	
	

}
