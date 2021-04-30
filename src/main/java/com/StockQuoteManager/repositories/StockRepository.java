package com.StockQuoteManager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.StockQuoteManager.domain.Stock;

@Repository
public interface StockRepository extends JpaRepository<Stock, Integer> {
	
	@Transactional(readOnly=true)
	Stock findByStockQuote(String id);
}
