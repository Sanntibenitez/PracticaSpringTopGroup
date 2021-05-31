package com.tg.practice.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tg.practice.spring.dao.impl.ControlStockServiceBean;
import com.tg.practice.spring.dao.impl.SignatureFormatter;

public class Main {

	public static void main(String[] args) {

//		ApplicationContext contexto = new ClassPathXmlApplicationContext(new String[] { "data-layer-context.xml",
//				"db-context.xml", "general-context.xml", "service-layer-context.xml" });

		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		Peticion de Beans a Spring
		ControlStockServiceBean controlStock = contexto.getBean("controlStockServiceBean", ControlStockServiceBean.class);
		
//		Peticion de Beans a Spring
		SignatureFormatter signatureFormatter = contexto.getBean("signatureFormatter", SignatureFormatter.class);
		
		System.out.println(controlStock.getCantidadMaximaImpresion());
		System.out.println(signatureFormatter.getSignature());
		
		contexto.close();

	}

}
