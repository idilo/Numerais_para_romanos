package br.com.caelum.service;

import java.util.HashMap;
import java.util.Map;

public class Conversor {
	

	private String romano = "";
	Map<Integer, String> mapa = new HashMap<Integer, String>();
	
	
	public String converte(int numero) {
		
		mapa.put(1, "I");
		mapa.put(4, "IV");
		mapa.put(5, "V");
		mapa.put(9, "IX");
		mapa.put(10, "X");
		mapa.put(40, "XL");
		mapa.put(50, "L");
		mapa.put(90, "XC");
		mapa.put(100, "C");
		mapa.put(400, "CD");
		mapa.put(500, "D");
		mapa.put(900, "CM");
		mapa.put(1000, "M");
		

		if (numero < 4) {
			return converteMenorQuatro(numero);
		}if(numero >= 5 && numero <10){
			return converteMaiorOuIgualCincoEMenorDez(numero);
		}if(numero >=10 && numero < 15){
			return converteMaiorOuIgualDezMenoQuinze(numero);
		}if(numero >=15 && numero < 20){
			int resto1 = numero%10;
			return mapa.get(10) + converteMaiorOuIgualCincoEMenorDez(resto1);
		}if(numero >=20){
			for(int i=1; i<=numero; i+=10){
				romano += mapa.get(10);
			}
		}
		
		
		
		return romano;
	}


	private String converteMaiorOuIgualDezMenoQuinze(int numero) {
		for (int i = 1; i <= numero-10; i++) {
			romano += mapa.get(1);
		}
		return mapa.get(10) + romano;
	}


	private String converteMenorQuatro(int numero) {
		for (int i = 1; i <= numero; i++) {
			romano += mapa.get(1);
		}
		return romano;
	}


	private String converteMaiorOuIgualCincoEMenorDez(int numero) {
		for (int i = 1; i <= numero-5; i++) {
			romano += mapa.get(1);
		}
		return mapa.get(5) + romano;
	}

}
