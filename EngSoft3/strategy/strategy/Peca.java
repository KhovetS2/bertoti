
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

	public void atacar() {
		this.pecaStrategy.atacar();
	}

	public void movimentar() {
		this.pecaStrategy.movimentar();
	}

}
