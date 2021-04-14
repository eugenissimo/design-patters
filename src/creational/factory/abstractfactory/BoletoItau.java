package creational.factory.abstractfactory;

public class BoletoItau implements Boleto {

	@Override
	public void emitir(Produto produto, double imposto) {
		System.out.println("BANCO ITAU");
		System.out.println("Descricao: " + produto.getNome());
		System.out.println("Quantidade: " + produto.getQuantidade());
		System.out.println("Valor unitario: " + produto.getValorUnitario());
		System.out.println("Imposto: " + imposto);
		System.out.println("Valor total: " + produto.getValorTotal(imposto));
	}
}