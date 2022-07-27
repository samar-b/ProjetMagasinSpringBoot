package tn.esprit.spring.services;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.SecteurActivite;
import tn.esprit.spring.repository.SecteurActiviteRepository;
@Service
public class SecteurActiviteServiceImpl implements SecteurActiviteService{
	@Autowired
	SecteurActiviteRepository secteurActiviteRepository;

	@Override
	public List<SecteurActivite> retrieveAllSecteurActivites() {
		
		return (List<SecteurActivite>) secteurActiviteRepository.findAll();
	}

	@Override
	public SecteurActivite addSecteurActivite(SecteurActivite sa) {
		
		return secteurActiviteRepository.save(sa);
	}

	@Override
	public SecteurActivite updateSecteurActivite(SecteurActivite sa) {
		
		return secteurActiviteRepository.save(sa);
	}

	@Override
	public SecteurActivite retrieveSecteurActivite(Long id) {
		
		return secteurActiviteRepository.findById(id).get();
	}

	@Override
	public void removeSecteurActivite(Long id) {
		secteurActiviteRepository.deleteById(id);
		
	}

}
