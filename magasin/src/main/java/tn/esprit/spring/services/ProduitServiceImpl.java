package tn.esprit.spring.services;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tn.esprit.spring.entities.CategorieProduit;
import tn.esprit.spring.entities.Produit;
import tn.esprit.spring.entities.Stock;
import tn.esprit.spring.repository.CategorieProduitRepository;
import tn.esprit.spring.repository.ProduitRepository;
import tn.esprit.spring.repository.StockRepository;
@Service
public class ProduitServiceImpl implements ProduitService{

	@Autowired
	ProduitRepository produitRepository;
	@Autowired
	CategorieProduitRepository categorieProduitRepository;
	@Autowired
	StockRepository stockRepository;
	@Override
	public List<Produit> retrieveAllProduits() {
		
		return (List<Produit>) produitRepository.findAll();
	}

	@Override
	//@Transactional
	public Produit addProduit(Produit p, Long idCategorieProduit, Long idStock) {
		
		CategorieProduit cp =categorieProduitRepository.findById(idCategorieProduit).get();
		Stock s=stockRepository.findById(idStock).get();
		Produit pr= produitRepository.save(p);
		pr.setStock(s);
		pr.setCategorieProduit(cp);
		return produitRepository.save(pr);
		
		
		
		
	}

	@Override
	public Produit updateProduit(Produit p, Long idCategorieProduit, Long idStock) {
		CategorieProduit cp =categorieProduitRepository.findById(idCategorieProduit).get();
		Stock s=stockRepository.findById(idStock).get();
		Produit pr= produitRepository.findById(p.getIdProduit()).get();
		pr.setCategorieProduit(cp);
		pr.setStock(s);
		return produitRepository.save(pr);
		
		
	}

	@Override
	public Produit retrieveProduit(Long id) {
		
		return produitRepository.findById(id).get();
	}

}
