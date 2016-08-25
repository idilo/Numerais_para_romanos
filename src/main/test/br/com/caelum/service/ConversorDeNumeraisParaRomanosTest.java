package br.com.caelum.service;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class ConversorDeNumeraisParaRomanosTest {

	@Test
	public void deveConverterNumeroAteTres() {
		Conversor conversor = new Conversor();
		assertEquals("III", conversor.converte(3));
	}
	
	@Test
	public void deveConverterNumeroMairOuIgualCinco() {
		Conversor conversor = new Conversor();
		assertEquals("VI", conversor.converte(6));
	}
	
	@Test
	public void deveConverterNumeroMairOuIgualDez() {
		Conversor conversor = new Conversor();
		assertEquals("XI", conversor.converte(11));
	}
	
	@Test
	public void deveConverterNumeroMairOuIgualQuinze() {
		Conversor conversor = new Conversor();
		assertEquals("XVIII", conversor.converte(18));
	}
	
	@Test
	public void deveConverterNumeroMultiplosDeDez() {
		Conversor conversor = new Conversor();
		assertEquals("XX", conversor.converte(20));
	}
	

}
