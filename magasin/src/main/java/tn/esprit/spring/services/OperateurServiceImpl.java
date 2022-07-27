package tn.esprit.spring.services;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Operateur;
import tn.esprit.spring.repository.OperateurRepository;
@Service
public class OperateurServiceImpl implements OperateurService {

	@Autowired
	OperateurRepository operateurRepository;
	@Override
	public List <Operateur> retrieveAllOperateurs() {
		
		return (List<Operateur>) operateurRepository.findAll();
	}

	@Override
	public Operateur addOperateur(Operateur o) {
		
		return operateurRepository.save(o);
	}

	@Override
	public Operateur updateOperateur(Operateur o) {
		
		return operateurRepository.save(o);
	}

	@Override
	public Operateur retrieveOperateur(Long id) {
		
		return operateurRepository.findById(id).get();
	}

	@Override
	public void removeOperateur(Long id) {
		operateurRepository.deleteById(id);
		
	}

}
