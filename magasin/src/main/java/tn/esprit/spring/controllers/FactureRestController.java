package tn.esprit.spring.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entities.Facture;
import tn.esprit.spring.services.FactureService;

@RestController
@RequestMapping("/facture")
public class FactureRestController {
	@Autowired
	FactureService fs;
	@GetMapping("/retrieve-all-factures")
	public List<Facture> getFactures(){
		List<Facture>factures=fs.retrieveAllFactures();
		return factures;
		
	}
	@GetMapping("/retrieve-facture/{idFacture}")
	public Facture retrieveFacture (@PathVariable("idFacture") Long idFacture) {
		return fs.retrieveFacture(idFacture);
		
	}
	@PutMapping("/cancel-facture/{idFacture}")
	public void cancelFacture (@PathVariable("idFacture") Long idFacture) {
		 fs.cancelFacture(idFacture);
		
	}
	
	
		
	

}
