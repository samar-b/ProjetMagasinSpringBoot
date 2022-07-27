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
import tn.esprit.spring.entities.Stock;
import tn.esprit.spring.services.OperateurService;
import tn.esprit.spring.services.StockService;

@RestController
@RequestMapping("/stock")
public class StockRestController {
	@Autowired
	StockService stockService;
	@GetMapping("/retrieve-all-stocks")
	public List<Stock> getStocks(){
		List<Stock>stocks=stockService.retrieveAllStocks();
		return stocks;
	}
	@GetMapping("retrieve-stock/{idStock}")
	public Stock retrieveStock(@PathVariable("idStock") Long idStock) {
		return stockService.retrieveStock(idStock);
		
	}
	@PostMapping("/add-stock")
	public Stock addStock(@RequestBody Stock s) {
		Stock stock =stockService.addStock(s);
		return stock;
		
	}
	@DeleteMapping("/remove-stock/{idStock}")
	public void removeStock(@PathVariable("idStock") Long idStock) {
		stockService.deleteStock(idStock);
	}
	@PutMapping("/modify-stock")
	public Stock modifyStock(@RequestBody Stock s) {
		return stockService.updateStock(s);
	}

}
