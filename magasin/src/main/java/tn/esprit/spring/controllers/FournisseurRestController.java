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
import tn.esprit.spring.entities.Fournisseur;
import tn.esprit.spring.services.CategorieProduitService;
import tn.esprit.spring.services.FournisseurService;

@RestController
@RequestMapping("/fournisseur")
public class FournisseurRestController {
	@Autowired
	 FournisseurService fournisseurService;
	@GetMapping("/retrieve-all-fournisseurs")
	public List<Fournisseur> getFournisseur(){
		List<Fournisseur> fournisseurs=fournisseurService.retrieveAllFournisseurs();
		return fournisseurs;
	}
	@GetMapping("retrieve-fournisseur/{idFournisseur}")
	public Fournisseur retrieveFournisseur(@PathVariable("idFournisseur") Long idFournisseur) {
		return fournisseurService.retrieveFournisseur(idFournisseur);
		
	}
	@PostMapping("/add-fournisseur")
	public Fournisseur addFournisseur(@RequestBody Fournisseur f) {
		Fournisseur fournisseur=fournisseurService.addFournisseur(f);
		return fournisseur;
		
	}

	@PutMapping("/modify-fournisseur")
	public Fournisseur modifyFournisseur(@RequestBody Fournisseur f) {
		return fournisseurService.updateFournisseur(f);
	}
	

}
