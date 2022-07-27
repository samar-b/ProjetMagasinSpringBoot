package tn.esprit.spring.services;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Facture;
import tn.esprit.spring.repository.FactureRepository;
@Service
public class FactureServiceImpl implements FactureService {

	@Autowired
	FactureRepository factureRepository;
	
	@Override
	public List<Facture> retrieveAllFactures() {
		
		return (List<Facture>) factureRepository.findAll();
	}

	@Override
	public void cancelFacture(Long id) {
		
		factureRepository.findById(id).get().setArchivee(true);
	}

	@Override
	public Facture retrieveFacture(Long id) {
		
		return factureRepository.findById(id).get();
	}

}
