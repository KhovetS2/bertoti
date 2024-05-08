package strategy;

public class Main {
	public static void main(String[] args) {

		Peca peca1 = new Peca();
		peca1.setPecaStrategy(new Cavalo());
		peca1.atacar();
		peca1.movimentar();

		Peca peca2 = new Peca();
		peca2.setPecaStrategy(new Rei());
		peca2.atacar();
		peca2.movimentar();

		Peca peca3 = new Peca();
		peca3.setPecaStrategy(new Peao());
		peca3.atacar();
		peca3.movimentar();

		Peca peca4 = new Peca();
		peca4.setPecaStrategy(new Torre());
		peca4.atacar();
		peca4.movimentar();
	}
}
