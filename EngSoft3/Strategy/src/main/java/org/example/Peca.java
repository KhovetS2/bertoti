package org.example;

/**
 * Peca
 */
public class Peca {

	private PecaStrategy pecaStrategy;

	public PecaStrategy getPecaStrategy() {
		return pecaStrategy;
	}

	public void setPecaStrategy(PecaStrategy pecaStrategy) {
		this.pecaStrategy = pecaStrategy;
	}

	public void fazerAtaque() {
		this.pecaStrategy.atacar();
	}

	public void fazerMovimento() {
		this.pecaStrategy.movimentar();
	}

}
