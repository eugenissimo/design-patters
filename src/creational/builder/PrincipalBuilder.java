package creational.builder;

import java.math.BigDecimal;

public class PrincipalBuilder {

	public static void main(String[] args) {
		Pedido pedido = new PedidoBuilder()
							.setPedido("00002")
							.setCliente(1, "Pedro", "2122-22222")
							.setVendedor(02, "Claudio")
							.setProduto("Contramágica", 4, new BigDecimal(5.00))
							.setProduto("Bumerangue", 4, new BigDecimal(2.00))
							.builder();
		pedido.informacoes();
	}
}