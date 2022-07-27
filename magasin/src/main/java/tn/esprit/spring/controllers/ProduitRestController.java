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

import tn.esprit.spring.entities.Operateur;
import tn.esprit.spring.entities.Produit;
import tn.esprit.spring.services.OperateurService;
import tn.esprit.spring.services.ProduitService;

@RestController
@RequestMapping("/produit")
public class ProduitRestController {
	@Autowired
	ProduitService produitService;
	@GetMapping("/retrieve-all-products")
	public List<Produit> getProducts(){
		List<Produit>produits=produitService.retrieveAllProduits();
		return produits;
	}
	@GetMapping("retrieve-product/{idProduit}")
	public Produit retrieveProduct(@PathVariable("idProduit") Long idProduit) {
		return produitService.retrieveProduit(idProduit);
		
	}
	@PostMapping("/add-product/{idCategorieProduit}/{idStock}")
	public Produit addProduct(@RequestBody Produit p,@PathVariable("idCategorieProduit") Long idCategorieProduit,@PathVariable("idStock") Long idStock) {
		Produit produit=produitService.addProduit(p, idCategorieProduit, idStock);
		return produit;
		
	}

	@PutMapping("/modify-product/{idCategorieProduit}/{idStock}")
	public Produit modifyProduct(@RequestBody Produit p,@PathVariable("idCategorieProduit") Long idCategorieProduit,@PathVariable("idStock") Long idStock) {
		return produitService.updateProduit(p, idCategorieProduit, idStock);
	}

}
