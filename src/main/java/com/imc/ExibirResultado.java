package com.imc;

public class ExibirResultado {

	public static void main(String[] args) {

		Float peso = (float) 60.5;

		Float altura = (float) 1.54;

		CalculaImc imc = new CalculaImc();

		System.out.println(imc.calculaImc(peso, altura));

	}

}
