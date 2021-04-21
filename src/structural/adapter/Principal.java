package structural.adapter;

public class Principal {

	public static void main(String[] args) {
		CotacaoAdapter cotacao = new CotacaoAdapter();
		cotacao.setValor(15);
		
		System.out.println("R$: " + cotacao.getValor());
		System.out.println("U$: " + cotacao.getValorDolar());
	}

}
