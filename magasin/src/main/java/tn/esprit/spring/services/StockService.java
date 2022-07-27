package tn.esprit.spring.services;

import java.util.List;
import java.util.Set;

import tn.esprit.spring.entities.Stock;


public interface StockService  {
	List<Stock> retrieveAllStocks();
	Stock addStock (Stock s);
	void deleteStock (Long id);
	Stock updateStock (Stock s);
	Stock retrieveStock (Long id);
	

}
