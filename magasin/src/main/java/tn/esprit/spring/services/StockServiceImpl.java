package tn.esprit.spring.services;


import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tn.esprit.spring.entities.Stock;
import tn.esprit.spring.repository.StockRepository;
@Service
public class StockServiceImpl implements StockService {

	@Autowired
	StockRepository stockRepository;
	@Override
	public List<Stock> retrieveAllStocks() {
		return  (List<Stock>) stockRepository.findAll() ;
	}

	@Override
	public Stock addStock(Stock s) {
		
		return stockRepository.save(s);
	}

	@Override
	public void deleteStock(Long id) {
		stockRepository.deleteById(id);
		
	}

	@Override
	public Stock updateStock(Stock s) {
		
		return stockRepository.save(s);
	}

	@Override
	public Stock retrieveStock(Long id) {
		
		return stockRepository.findById(id).get();
	}


}
