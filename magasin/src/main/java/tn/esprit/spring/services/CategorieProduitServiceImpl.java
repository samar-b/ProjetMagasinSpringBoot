package tn.esprit.spring.services;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.CategorieProduit;
import tn.esprit.spring.repository.CategorieProduitRepository;
@Service
public class CategorieProduitServiceImpl implements CategorieProduitService {
	@Autowired
	CategorieProduitRepository categorieProduitRepository;	
	

	@Override
	public List<CategorieProduit> retrieveAllCategorieProduits() {
		
		return (List<CategorieProduit>) categorieProduitRepository.findAll();
	}

	@Override
	public CategorieProduit addCategorieProduit(CategorieProduit cp) {
		
		return categorieProduitRepository.save(cp);
	}

	@Override
	public CategorieProduit updateCategorieProduit(CategorieProduit cp) {
		
		return categorieProduitRepository.save(cp);
	}

	@Override
	public CategorieProduit retrieveCategorieProduit(Long id) {
		
		return categorieProduitRepository.findById(id).get();
	}

	@Override
	public void removeCategorieProduit(Long id) {
		categorieProduitRepository.deleteById(id);
		
	}

}
