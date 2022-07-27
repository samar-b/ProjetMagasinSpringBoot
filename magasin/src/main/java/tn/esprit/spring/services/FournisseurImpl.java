package tn.esprit.spring.services;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Fournisseur;
import tn.esprit.spring.repository.FournisseurRepository;
@Service
public class FournisseurImpl implements FournisseurService {

	@Autowired
	FournisseurRepository fournisseurRepository;
	@Override
	public List<Fournisseur> retrieveAllFournisseurs() {
		
		return (List<Fournisseur>) fournisseurRepository.findAll();
	}

	@Override
	public Fournisseur addFournisseur(Fournisseur f) {
		
		return fournisseurRepository.save(f);
	}

	@Override
	public Fournisseur updateFournisseur(Fournisseur f) {
		
		return fournisseurRepository.save(f);
	}

	@Override
	public Fournisseur retrieveFournisseur(Long id) {
		
		return fournisseurRepository.findById(id).get();
	}

}
