package creational.singleton;

public class GerenciadorImpressao {

	private static GerenciadorImpressao gerenciadorImpressao;

	private GerenciadorImpressao() {

	}

	public static GerenciadorImpressao getInstance() {
		if (gerenciadorImpressao == null) {
			gerenciadorImpressao = new GerenciadorImpressao();
		}
		return gerenciadorImpressao;
	}
}