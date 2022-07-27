package tn.esprit.spring.services;

import java.util.List;
import java.util.Set;

import tn.esprit.spring.entities.CategorieProduit;

public interface CategorieProduitService {
	List<CategorieProduit> retrieveAllCategorieProduits();
	CategorieProduit addCategorieProduit(CategorieProduit cp);
	CategorieProduit updateCategorieProduit(CategorieProduit cp);
	CategorieProduit retrieveCategorieProduit(Long id);
	void removeCategorieProduit(Long id);

}
