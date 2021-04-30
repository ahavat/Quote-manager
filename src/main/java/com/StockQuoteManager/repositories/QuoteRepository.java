package com.StockQuoteManager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.StockQuoteManager.domain.Quote;

@Repository
public interface QuoteRepository extends JpaRepository<Quote, Integer> {

}
