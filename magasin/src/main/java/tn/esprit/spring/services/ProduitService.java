package tn.esprit.spring.services;

import java.util.List;
import java.util.Set;

import tn.esprit.spring.entities.Produit;

public interface ProduitService {
	List<Produit> retrieveAllProduits();
	Produit addProduit (Produit p, Long idCategorieProduit, Long idStock);
	Produit updateProduit (Produit p, Long idCategorieProduit, Long idStock);
	Produit retrieveProduit(Long id);

}
