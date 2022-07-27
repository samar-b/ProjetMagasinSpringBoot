package tn.esprit.spring.services;

import java.util.List;
import java.util.Set;

import tn.esprit.spring.entities.Operateur;

public interface OperateurService {
	List<Operateur> retrieveAllOperateurs();
	Operateur addOperateur (Operateur o);
	Operateur updateOperateur (Operateur o);
	Operateur retrieveOperateur (Long id);
	void removeOperateur (Long id);

}
