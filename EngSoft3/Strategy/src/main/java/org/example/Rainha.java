package org.example;

public class Rainha implements PecaStrategy {

	public void atacar() {

		System.out.println("Ataca em um linha nas diagonais e nas retas");
	}

	public void movimentar() {
		System.out.println("Se movimenta em uma linha nas diagonais e nas retas");
	}
}
