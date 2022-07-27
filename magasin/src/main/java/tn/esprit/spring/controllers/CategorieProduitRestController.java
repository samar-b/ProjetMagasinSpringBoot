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
import tn.esprit.spring.services.CategorieProduitService;

@RestController
@RequestMapping("/categorie-produit")
public class CategorieProduitRestController {
	@Autowired
	CategorieProduitService categorieProduitService;
	@GetMapping("/retrieve-all-categorie-produits")
	public List<CategorieProduit> getCategorieProduits(){
		List<CategorieProduit> categorieProduits=categorieProduitService.retrieveAllCategorieProduits();
		return categorieProduits;
	}
	@GetMapping("retrieve-categorie-produit/{idCategorieProduit}")
	public CategorieProduit retrieveCategorieProduit(@PathVariable("idCategorieProduit") Long idCategorieProduit) {
		return categorieProduitService.retrieveCategorieProduit(idCategorieProduit);
		
	}
	@PostMapping("/add-categorie-produit")
	public CategorieProduit addCategorieProduit(@RequestBody CategorieProduit cp) {
		CategorieProduit categorieProduit=categorieProduitService.addCategorieProduit(cp);
		return categorieProduit;
		
	}
	@DeleteMapping("/remove-categorie-produit/{idCategorieProduit}")
	public void removeCategorieProduit(@PathVariable("idCategorieProduit") Long idCategorieProduit) {
		categorieProduitService.removeCategorieProduit(idCategorieProduit);
	}
	@PutMapping("/modify-categorie-produit")
	public CategorieProduit modifyCategorieProduit(@RequestBody CategorieProduit cp) {
		return categorieProduitService.updateCategorieProduit(cp);
	}
	
	

}
