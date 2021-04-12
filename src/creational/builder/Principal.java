package creational.builder;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setCodigo(100);
		cliente.setNome("Pedro");
		cliente.setTelefone("2122-22222");

		Vendedor vendedor = new Vendedor();
		vendedor.setCodigo(1);
		vendedor.setNome("Paulo");

		Produto produto1 = new Produto();
		produto1.setQuantidade(4);
		produto1.setNome("Stasis");
		produto1.setValor(new BigDecimal(25.00));

		Produto produto2 = new Produto();
		produto2.setQuantidade(4);
		produto2.setNome("Black Vise");
		produto2.setValor(new BigDecimal(5.00));

		Pedido pedido = new Pedido();
		pedido.setNumeroPedido("00001");
		pedido.setCliente(cliente);
		pedido.setVendedor(vendedor);
		pedido.setProdutos(new ArrayList<>());
		pedido.getProdutos().add(produto1);
		pedido.getProdutos().add(produto2);

		pedido.informacoes();
	}

}
