package tn.esprit.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entities.CategorieProduit;
import tn.esprit.spring.entities.Operateur;
import tn.esprit.spring.services.CategorieProduitService;
import tn.esprit.spring.services.OperateurService;

@RestController
@RequestMapping("/operateur")
public class OperateurRestController {
	@Autowired
	OperateurService operateurService;
	@GetMapping("/retrieve-all-operateurs")
	public List<Operateur> getOperateurs(){
		List<Operateur>operateurs=operateurService.retrieveAllOperateurs();
		return operateurs;
	}
	@GetMapping("retrieve-operateur/{idOperateur}")
	public Operateur retrieveOperateur(@PathVariable("idOperateur") Long idOperateur) {
		return operateurService.retrieveOperateur(idOperateur);
		
	}
	@PostMapping("/add-operateur")
	public Operateur addOperateur(@RequestBody Operateur o) {
		Operateur operateur=operateurService.addOperateur(o);
		return operateur;
		
	}
	@DeleteMapping("/remove-operateur/{idOperateur}")
	public void removeOperateur(@PathVariable("idOperateur") Long idOperateur) {
		operateurService.removeOperateur(idOperateur);
	}
	@PutMapping("/modify-operateur")
	public Operateur modifyOperateur(@RequestBody Operateur o) {
		return operateurService.updateOperateur(o);
	}

}
