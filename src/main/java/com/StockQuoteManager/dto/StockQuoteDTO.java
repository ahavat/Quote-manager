package com.StockQuoteManager.dto;

import java.util.Date;

import javax.validation.constraints.NotEmpty;

import com.StockQuoteManager.domain.Stock;

public class StockQuoteDTO {
	
	@NotEmpty()
	private String id;
	@NotEmpty()
	private Date dateQuote;
	@NotEmpty()
	private Double priceQuote;
	
	public StockQuoteDTO(@NotEmpty String idNome, @NotEmpty Date dateQuote, @NotEmpty Double priceQuote) {
		super();
		this.id = idNome;
		this.dateQuote = dateQuote;
		this.priceQuote = priceQuote;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
	
	}
