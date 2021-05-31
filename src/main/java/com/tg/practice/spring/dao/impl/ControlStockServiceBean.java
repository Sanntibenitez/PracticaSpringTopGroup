package com.tg.practice.spring.dao.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import com.tg.practice.spring.model.Pedido;
import com.tg.practice.spring.service.ControlStockService;
import com.tg.practice.spring.service.MessageFormatter;

public class ControlStockServiceBean implements ControlStockService {

	private Long cantidadMaximaImpresion;

	public List<MessageFormatter> cadenaDeFormatters() {
		SignatureFormatter signatureFormatter = new SignatureFormatter(null);
		LenguageFormatter lenguageFormatter = new LenguageFormatter();
		return Arrays.asList(signatureFormatter, lenguageFormatter);
	}

	public Long getCantidadMaximaImpresion() {
		return cantidadMaximaImpresion;
	}

	public void setCantidadMaximaImpresion(Long cantidadMaximaImpresion) {
		this.cantidadMaximaImpresion = cantidadMaximaImpresion;
	}

	public void actualizarStock(Long cantidad) {
		// TODO Auto-generated method stub

	}

	public List<Pedido> findPedidosConSock() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<String> imprimirStocks(Locale locale) {
		// TODO Auto-generated method stub
		return null;
	}

}
