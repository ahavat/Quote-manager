package com.StockQuoteManager.resources;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.StockQuoteManager.domain.Stock;
import com.StockQuoteManager.dto.StockQuoteDTO;
import com.StockQuoteManager.service.QuoteService;

@RestController
@RequestMapping(value="/quote")
public class StockQuoteResource {
	
	@Autowired
	private QuoteService service;
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<StockQuoteDTO> insertNewQuote(@Valid @RequestBody StockQuoteDTO objDTO) {
		Stock obj = service.fromDTO(objDTO);
		
		obj = service.insertNewQuote(obj);
				
		return ResponseEntity.status(201).build();
	} 
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<Stock> find (@PathVariable String objId) {
		Stock obj = service.findByStockQuote(objId);
		return ResponseEntity.ok().body(obj);
	}
	
	

}
