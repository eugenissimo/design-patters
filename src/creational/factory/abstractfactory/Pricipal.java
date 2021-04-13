package creational.factory.abstractfactory;

import java.math.BigDecimal;

public class Pricipal {

	public static void main(String[] args) {
		Produto produto = new Produto();
		
		produto.setNome("Bohemia");
		produto.setQuantidade(12);
		produto.setValorUnitario(new BigDecimal(3));
		
		VendaFactory factory = new CervejariaCarioca();
		
		Venda venda = new Venda(factory);
		
		venda.realizarVenda(produto);

	}

}
