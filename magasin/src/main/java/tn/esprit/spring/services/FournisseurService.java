package tn.esprit.spring.services;

import java.util.List;
import java.util.Set;

import tn.esprit.spring.entities.Fournisseur;

public interface FournisseurService {
	List<Fournisseur> retrieveAllFournisseurs();
	Fournisseur addFournisseur (Fournisseur f);
	Fournisseur updateFournisseur (Fournisseur f);
	Fournisseur retrieveFournisseur (Long id);

}
