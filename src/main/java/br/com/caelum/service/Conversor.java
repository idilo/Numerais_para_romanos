package br.com.caelum.service;

public class Conversor {

	int[] numeros = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
	String[] romanos = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

	String romano = "";

	public String converte(int decimal) {

		for (int i = 0; i < numeros.length; i++) {
			while (decimal >= numeros[i]) {
				romano += romanos[i];
				decimal -= numeros[i];
			}
		}

		return romano;
	}

}
