package com.StockQuoteManager.service;

import java.util.List;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StockQuoteManager.domain.Quote;
import com.StockQuoteManager.domain.Stock;
import com.StockQuoteManager.dto.StockQuoteDTO;
import com.StockQuoteManager.repositories.QuoteRepository;
import com.StockQuoteManager.repositories.StockRepository;

@Service
public class QuoteService {
	
	@Autowired
	private QuoteRepository repo;
	
	@Autowired
	private StockRepository stockRepo;
	
	
	public Stock insertNewQuote(Stock obj) {
		obj.setIdentify(null);
		obj = stockRepo.save(obj);
		
		repo.saveAll(obj.getQuotes());
		
		return obj;
	}
	
	public List<Stock> findAll() {
		return stockRepo.findAll();
	} 
	
	public Stock findByStockQuote(String idNome) {
		
		Stock obj = stockRepo.findByStockQuote(idNome);
		if (obj == null) {
			throw new ObjectNotFoundException("Quote not found! Id: ", idNome);
		}
		return obj;
		
	}
	
	public Stock fromDTO(StockQuoteDTO objDTO) {
		Stock stock = new Stock(null,objDTO.getId(), null);
		Quote quote = new Quote(objDTO.getDateQuote(), objDTO.getPriceQuote(), null);
		stock.getQuotes().add(quote);
		return stock;
	}
	
	
	
}
