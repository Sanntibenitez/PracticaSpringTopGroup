package com.tg.practice.spring.service;

import java.util.List;
import java.util.Locale;

import com.tg.practice.spring.model.Pedido;

public interface ControlStockService {
	
	void actualizarStock(Long cantidad);
	
	List<Pedido> findPedidosConSock();
	
	List<String> imprimirStocks(Locale locale);
}
