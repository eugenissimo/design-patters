package creational.factorymethod;

public class Representante {

	public static void main(String[] args) {
		EmpresaFornecedora pedido = new Fornecedora();

		pedido.criarPedido("RJ", "agua");
		pedido.criarPedido("SP", "agua");
		pedido.criarPedido("MG", "cigarro");

	}
}