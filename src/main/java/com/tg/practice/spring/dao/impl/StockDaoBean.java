package com.tg.practice.spring.dao.impl;

import java.util.List;
import java.util.Locale;

import com.tg.practice.spring.mocks.StockMocks;
import com.tg.practice.spring.model.Stock;

public class StockDaoBean {
	
	public List<Stock> getStocks(Locale idioma) {
		return new StockMocks().getStocks();
	}
}
