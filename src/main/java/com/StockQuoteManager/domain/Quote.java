package com.StockQuoteManager.domain;

import java.util.Date;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Quote {
	
	private Date dateQuote;
	private Double priceQuote;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="stock_id")
	private Stock stock;
	
	public Quote() {
	}

	public Quote(Date dateQuote, Double priceQuote, Stock stock) {
		super();
		this.dateQuote = dateQuote;
		this.priceQuote = priceQuote;
		this.stock = stock;
	}

	public Date getDateQuote() {
		return dateQuote;
	}

	public void setDateQuote(Date dateQuote) {
		this.dateQuote = dateQuote;
	}

	public Double getPriceQuote() {
		return priceQuote;
	}

	public void setPriceQuote(Double priceQuote) {
		this.priceQuote = priceQuote;
	}

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}
}
