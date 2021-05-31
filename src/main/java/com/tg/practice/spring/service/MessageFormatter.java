package com.tg.practice.spring.service;

import java.util.Locale;

public interface MessageFormatter {
	
	String format(String cadena,Object[] objects,Locale locale);
}
